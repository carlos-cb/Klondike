package Klondike;

import java.util.ArrayList;
import java.util.List;

public class Board {

	public static final int MAX_FOUNDATIONS_TABLEAU = 7;
	public static final int MAX_FOUNDATIONS = 40;
	private DeckStack deckStack;
	private WasteStack waste;
	private List<SuiteStack> tableaus;
	private List<SuiteStack> suite1;
	MoveControllerFactory moveControllerFactory;
	public SuiteStack[] suites;
	public static final int NUM_SUITS = 4;
	public static final int FULL_CARD = 12;
	private SuiteStack tableau;
	
	public Board(){
		deckStack = new DeckStack();
		
		waste = new WasteStack();
		
		tableaus = new ArrayList<SuiteStack>();
		for(int i=0;i<7;i++){
			tableaus.add(new SuiteStack(null));
		}
		
		suite1 = new ArrayList<SuiteStack>();
		for(int i=0;i<4;i++){
			suite1.add(new SuiteStack(null));
		}
			
		suites = new SuiteStack[NUM_SUITS];
		suites[0] = new SuiteStack(CardSuite.HEART);
		suites[1] = new SuiteStack(CardSuite.DIAMOND);
		suites[2] = new SuiteStack(CardSuite.SPADE);
		suites[3] = new SuiteStack(CardSuite.CLUB);

	}

	public int sizeDeck() {
		return deckStack.getSize();
	}

	public SuiteStack getTableau() {
		return tableau;
	}
	
	public List<SuiteStack> getTableaus() {
		return tableaus;
	}
	
	public WasteStack getWaste() {
		return waste;
	}
	
	public DeckStack getDeckStack() {
		return deckStack;
	}

	
	public SuiteStack getSuite(int numSuit){
		return suites[numSuit];
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

	public int sizeWaste() {
		return waste.getSize();
	}

}
