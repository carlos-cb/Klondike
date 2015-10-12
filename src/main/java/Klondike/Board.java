package Klondike;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

public class Board implements BoardForView{

	public static final int MAX_FOUNDATIONS_TABLEAU = 7;
	public static final int MAX_FOUNDATIONS = 40;
	private DeckStack deckStack;
	private Waste waste;
	private List<Tableau> tableaus;
	private List<Suite> suite1;
	MoveControllerFactory moveControllerFactory;
	public Suite[] suites;
	public static final int NUM_SUITS = 4;
	public static final int FULL_CARD = 12;
	private Tableau tableau;
	
	public Board(){
		deckStack = new DeckStack();
		
		waste = new Waste();
		
		tableaus = new ArrayList<Tableau>();
		for(int i=0;i<7;i++){
			tableaus.add(new Tableau());
		}
		generateCards(deckStack,tableaus);
		
		suite1 = new ArrayList<Suite>();
		for(int i=0;i<4;i++){
			suite1.add(new Suite(null));
		}
			
		suites = new Suite[NUM_SUITS];
		suites[0] = new Suite(CardSuite.HEART);
		suites[1] = new Suite(CardSuite.DIAMOND);
		suites[2] = new Suite(CardSuite.SPADE);
		suites[3] = new Suite(CardSuite.CLUB);

	}
	
	private void generateCards(DeckStack deckStack, List<Tableau> tableaus) {
		Stack<Card> allCards = new Stack<Card>();
		
		for(CardSuite cardSuite : CardSuite.values()){
			for(int i=Card.min_score;i<=Card.max_score;i++){
				allCards.push(new Card(i,cardSuite));
			}
		}
		
		Random random = new Random();	
		while(deckStack.size()!=DeckStack.MAX_CARDS){
			int randomOrder = random.nextInt(allCards.size());
			if(allCards.get(randomOrder)!=null){
				deckStack.push(allCards.get(randomOrder));
				allCards.remove(randomOrder);
			}				
		}
		
		for(int i=0;i<7;i++){
			while(tableaus.get(i).size()!=i+1){
				int randomOrder = random.nextInt(allCards.size());
				if(allCards.get(randomOrder)!=null){
					tableaus.get(i).push(allCards.get(randomOrder));
					allCards.remove(randomOrder);
				}
			}
			tableaus.get(i).peek().setCovered(false);
		}
	}

	public int sizeWaste() {
		return waste.size();
	}

	public int sizeDeck() {
		return deckStack.size();
	}

	public ArrayList<Integer> sizeCoveredCardsStackTableaus() {
		ArrayList<Integer> sizeCoveredCardsTableaus = new ArrayList<Integer>();
		for(Tableau tableau : tableaus){
			sizeCoveredCardsTableaus.add(tableau.getCoveredCards());
		}
		return sizeCoveredCardsTableaus;
	}

	public ArrayList<Stack<Card>> uncoveredCardsStackTableaus() {
		ArrayList<Stack<Card>> uncoveredCardsStackTableaus = new ArrayList<Stack<Card>>();
		for(Tableau tableau : tableaus){
			uncoveredCardsStackTableaus.add(tableau.getUncoveredCards());
		}
		return uncoveredCardsStackTableaus;
	}

	public Tableau getTableau() {
		return tableau;
	}
	
	public List<Tableau> getTableaus() {
		return tableaus;
	}
	
	public Waste getWaste() {
		return waste;
	}
	
	public DeckStack getDeckStack() {
		return deckStack;
	}

	
	public Suite getSuite(int numSuit){
		return suites[numSuit];
	}
	

	@Override
	public Color getColor(Card card) {
		assert card != null;
		return card.getColor();
	}

	public boolean existKlondike() {
		
		if(suites[0].getSize()==FULL_CARD && suites[1].getSize()==FULL_CARD && suites[2].getSize()== FULL_CARD&&suites[3].getSize()==FULL_CARD){
			return true;
		}
		return false;
	}

	public boolean isPosibleMove(int suite, int tableau) {
		return false;
	}

	public boolean isPosibleMove(int escalera) {
		return false;
	}

}
