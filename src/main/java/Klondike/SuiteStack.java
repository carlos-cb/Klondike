package Klondike;

import java.util.ArrayList;

public class SuiteStack extends CardStack{
	private CardSuite suite;
	private ArrayList<Card> cards;
	private CardSuite cardSuite;
	
	public SuiteStack(CardSuite suite) {
		this.suite = suite;
		cards = new ArrayList<Card>();
	}

	public int getSize() {
		return cards.size();
	}

	public Card getLastCard(){
		if(cards.size() == 0){
			return null;
		}
		return cards.get(cards.size()-1);
	}
	
	public CardSuite getName(){
		return suite;
		
	}

	@Override
	public boolean isValidOnTop(Card card) {
		if (!card.iscovered() || card.getCardSuite() != this.cardSuite) {
			return false;
		}
	
		if (this.isEmpty() && card.getNumber() == Number.AS) {
			return true;
		}
		
		if (!this.isEmpty() && 
				this.viewCardFromTop().getNumber().getValue() < 
					card.getNumber().getValue()) {
			return true;
		}
		
		return false;
	}

}
