package KlondikeTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import Klondike.Card;
import Klondike.CardSuite;
import Klondike.DeckStack;
import Klondike.Suite;
import Klondike.Tableau;
import Klondike.Waste;
import Klondike.MoveController;
import Klondike.MoveDecktoWaste;
import Klondike.Board;

import org.junit.Before;
import org.junit.Test;



public class MoveControllerTest {
	
	private MoveController moveController;
	private MoveDecktoWaste moveDecktoWaste;
	
//	@Before
//	public void init() {
//		moveController = new MoveController();
//		moveDecktoWaste = new MoveDecktoWaste(Board board);
//	}

	@Test
	public void moveDeckToWasteTest() {
		Card card = new Card(1,CardSuite.CLUB);
		DeckStack deckStack = new DeckStack();
		deckStack.push(card);
		Waste Waste = new Waste();
			
		int numberCardsDeckStack = deckStack.size();
		int numberCardsWaste = Waste.size();		
		
		assertFalse(deckStack.isEmpty());
		
		moveDecktoWaste.move(deckStack,Waste);
		
		assertEquals(numberCardsDeckStack-1,deckStack.size());
		assertEquals(numberCardsWaste+1,Waste.size());
		assertEquals(card,Waste.peek());
	}
	
	@Test
	public void moveWasteToFoundationTest() {
		Card card = new Card(1,CardSuite.CLUB);
		Waste Waste = new Waste();
		Waste.push(card);
		
		Suite Suite = new Suite(null);
		
		assertTrue(Suite.canPush(card));
		assertFalse(Waste.isEmpty());
				
		int numberCardsWaste = Waste.size();
		int numberCardsSuite = Suite.size();
		
		moveDecktoWaste.move(Waste,Suite);
		
		assertEquals(numberCardsWaste-1,Waste.size());
		assertEquals(numberCardsSuite+1,Suite.size());
		assertEquals(card,Suite.peek());
	}
	
	@Test
	public void moveWasteToTableausTest() {
		Card card = new Card(1,CardSuite.CLUB);
		Waste Waste = new Waste();
		Waste.push(card);
		
		Tableau Tableau = new Tableau();
		
		assertTrue(Tableau.canPush(card));
		assertFalse(Waste.isEmpty());
				
		int numberCardsWaste = Waste.size();
		int numberCardsTableauStack = Tableau.size();
		
		moveDecktoWaste.move(Waste,Tableau);
		
		assertEquals(numberCardsWaste-1,Waste.size());
		assertEquals(numberCardsTableauStack+1,Tableau.size());
		assertEquals(card,Tableau.peek());
	}
	
	@Test
	public void moveWasteToDefinedTableauTest() {
		Card card = new Card(2,CardSuite.CLUB);
		Waste Waste = new Waste();
		Waste.push(card);
		
		Tableau TableauRed = new Tableau();
		Tableau TableauBlack = new Tableau();
		Card cardRed = new Card(1,CardSuite.DIAMOND);
		Card cardBlack = new Card(1,CardSuite.CLUB);
		
		assertTrue(TableauRed.canPush(cardRed));
		TableauRed.add(cardRed);
		
		assertTrue(TableauBlack.canPush(cardBlack));
		TableauBlack.add(cardBlack);
		
		assertFalse(Waste.isEmpty());
		
		int numberCardsWaste = Waste.size();
		int numberCardsTableauRed = TableauRed.size();
		int numberCardsTableauBlack = TableauBlack.size();

		assertFalse(TableauBlack.canPush(card));
		assertFalse(moveDecktoWaste.move(Waste,TableauBlack));
		assertEquals(numberCardsWaste,Waste.size());
		assertEquals(numberCardsTableauBlack,TableauBlack.size());
		
		assertTrue(TableauRed.canPush(card));
		assertTrue(moveDecktoWaste.move(Waste,TableauRed));
		assertEquals(numberCardsWaste-1,Waste.size());
		assertEquals(numberCardsTableauRed+1,TableauRed.size());		
		assertEquals(card,TableauRed.peek());
	}
	
	@Test
	public void moveWasteToDefinedFoundationTest() {
		Card cardDiamondTop = new Card(2,CardSuite.CLUB);
		Waste Waste = new Waste();
		Waste.push(cardDiamondTop);
		
		Suite foundationDiamond = new Suite(null);
		Suite foundationClub = new Suite(null);
		Card cardDiamond = new Card(1,CardSuite.DIAMOND);
		Card cardClub = new Card(1,CardSuite.CLUB);
		
		assertTrue(foundationDiamond.canPush(cardDiamond));		
		foundationDiamond.add(cardDiamond);
		assertFalse(foundationDiamond.canPush(cardClub));
		
		assertTrue(foundationClub.canPush(cardClub));		
		foundationClub.add(cardClub);
		assertFalse(foundationClub.canPush(cardDiamond));
		
		assertFalse(Waste.isEmpty());
		
		int numberCardsWaste = Waste.size();
		int numberCardsFoundationDiamond = foundationDiamond.size();
		int numberCardsFoundationClub = foundationClub.size();

		assertFalse(moveDecktoWaste.move(Waste,foundationDiamond));
		assertEquals(numberCardsWaste,Waste.size());
		assertEquals(numberCardsFoundationDiamond,foundationDiamond.size());		
		
		assertTrue(moveDecktoWaste.move(Waste,foundationClub));
		assertEquals(numberCardsWaste-1,Waste.size());
		assertEquals(numberCardsFoundationClub+1,foundationClub.size());
		assertEquals(cardDiamondTop,foundationClub.peek());		
	}
	
}
