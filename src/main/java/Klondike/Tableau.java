package Klondike;

import java.util.ArrayList;
import java.util.Stack;

public class Tableau extends CardStack{


	private static final long serialVersionUID = 1L;
	private ArrayList<Card> cards;
	
	public boolean canPush(Card card) {
		if(this.isEmpty() && card.isFirst()) return true;
		Card topCard = this.peek();
		if(!topCard.iscovered() || card.isSameColor(topCard) || !card.isNext(topCard)) return false;		
		return true;
	}

	public Integer getCoveredCards() {
		int coveredCards = 0;
		for(Card card : this){
			if(card.iscovered()) coveredCards++;
		}
		return coveredCards;
	}

	public Stack<Card> getUncoveredCards() {
		Stack<Card> uncoveredCards = new Stack<Card>();
		for(Card card : this){
			if(!card.iscovered()) uncoveredCards.add(card);
		}
		return uncoveredCards;
	}

	public boolean addMovedCard(Card card){
		assert card != null;
		Card getLastCard = cards.get(cards.size()-1);
		if(getLastCard.getValue()+1 == card.getValue() && !getLastCard.getColor().equals(card.getColor())){
			return cards.add(card);
		}
		return false;
	}
	
}
