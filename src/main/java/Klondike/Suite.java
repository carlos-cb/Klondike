package Klondike;

import java.util.ArrayList;

public class Suite extends CardStack{

	private static final long serialVersionUID = 1L;
	private CardSuite suite;
	private ArrayList<Card> cards;
	
	public Suite(CardSuite suite) {
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
	public boolean canPush(Card card) {
		if(this.isEmpty() && card.isFirst()) return true;
		Card topCard = this.peek();
		if(card.isSameColor(topCard) && card.isNext(topCard)){
			return true;
		}
		return false;
	}

}
