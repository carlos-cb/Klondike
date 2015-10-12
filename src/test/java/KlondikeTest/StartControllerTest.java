package KlondikeTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import Klondike.Card;
import Klondike.Tableau;
import Klondike.StartController;
import Klondike.Board;
import org.junit.Before;
import org.junit.Test;



public class StartControllerTest {

	private StartController StartController;
	private Board board;
	
	@Before
	public void before() {
		StartController = new StartController(null, null);
	}
	
	@Test
	public void sizeWasteTest() {
		assertEquals(0, board.sizeWaste());
	}
	
	@Test
	public void sizeDeckTest() {
		assertEquals(24, board.sizeDeck());
	}
	
	@Test
	public void sizeTableausTest() {
		List<Tableau> tableaus = board.getTableaus();
		
		assertEquals(7, tableaus.size());
		
		
		ArrayList<Integer> coveredCardsStackTableaus = board.sizeCoveredCardsStackTableaus();
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = board.uncoveredCardsStackTableaus();
		
		assertEquals(7, coveredCardsStackTableaus.size());
		assertEquals(7, uncoveredCardsStackTableaus.size());
		
		for(int i=0;i<coveredCardsStackTableaus.size();i++) {
			assertEquals(new Integer(i),coveredCardsStackTableaus.get(i));
		}
		
		for(int i=0;i<coveredCardsStackTableaus.size();i++) {
			assertEquals(new Integer(i), coveredCardsStackTableaus.get(i));
		}
		
		for(Stack<Card> uncoveredCardsStack : uncoveredCardsStackTableaus) {
			assertEquals(1, uncoveredCardsStack.size());
			assertFalse(uncoveredCardsStack.peek().iscovered()); 
		}
	}
	
	@Test
	public void totalCardsTest(){
		int cardsNumber=0;
		
		cardsNumber += board.sizeDeck();
		cardsNumber += board.sizeWaste();
		
		ArrayList<Integer> sizeCoveredCardsTableaus = board.sizeCoveredCardsStackTableaus();
		for (int i = 0; i < sizeCoveredCardsTableaus.size(); i++) {
			cardsNumber += sizeCoveredCardsTableaus.get(i);
		}
		
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = board.uncoveredCardsStackTableaus();
		for (Stack<Card> uncoveredCardsStack : uncoveredCardsStackTableaus) {
			cardsNumber += uncoveredCardsStack.size();
		}
		
		assertEquals(52, cardsNumber);
	}
}
