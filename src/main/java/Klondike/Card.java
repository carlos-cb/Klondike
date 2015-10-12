package Klondike;

public class Card {

	public final static int max_score = 13;
	public final static int min_score = 1;
	public static final int max_cards = 24;
	private CardSuite cardSuite;
	boolean covered;
	private int value;
	private Color color;
	
	public Card(int value, CardSuite cardSuite){
		this.value = value;
		this.cardSuite = cardSuite;
		covered = true;
	}
	public boolean iscovered(){
		return covered;
	}
	
	public int getValue(){
		return value;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public Card turnover(){
		this.covered = !this.covered;
		return this;
	}
	
	public void setCovered(boolean covered){
		this.covered = covered;
	}
	
	public CardSuite getCardSuite(){
		return cardSuite;
	}
	
	public void setSuite(CardSuite cardSuite){
		this.cardSuite = cardSuite;
	}
	
	public boolean isSameColor(Card topCard) {
		return Color.isSameColor(this, topCard);				
	}

	public boolean isFirst() {
		return value == 1;
	}
	public Color getColor() {
		return color;
	}
	public boolean isNext(Card topCard) {
		return this.value == topCard.getValue()+1;
	}
	
	

	
	
	
	
	
}
