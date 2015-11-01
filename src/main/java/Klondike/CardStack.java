package Klondike;

import java.util.Collections;
import java.util.Stack;

public abstract class CardStack {
	
	private Stack<Card> cards;
	public CardStack() {
		this.cards = new Stack<>();
	}
	
	public void putCardOnTop(Card card) {
		cards.push(card);
	}
	
	public Card takeCardFromTop() {
		return cards.pop();
	}
	
	public Card viewCardFromTop() {
		return cards.peek();
	}
	
	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public int getSize() {
		return this.cards.size();
	}
	
	public Stack<Card> getCards() {
		return this.cards;
	}
	
	public abstract boolean isValidOnTop (Card card);
	
}
