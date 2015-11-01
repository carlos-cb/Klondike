package Klondike;

public class Card {

	private CardSuite cardSuite;
	boolean covered;
	private int value;
	private Number number;
	
	public Card(Number number, CardSuite cardSuite){
		this.number = number;
		this.cardSuite = cardSuite;
		covered = true;
	}
	public boolean iscovered(){
		return this.covered;
	}
	
	public Card turnover(){
		this.covered = !this.covered;
		return this;
	}
	
	public void setCovered(boolean covered){
		this.covered = covered;
	}
	
	public CardSuite getCardSuite(){
		return this.cardSuite;
	}
	
	public void setSuite(CardSuite cardSuite){
		this.cardSuite = cardSuite;
	}

	public boolean isFirst() {
		return value == 1;
	}
	
	public Number getNumber() {
		return this.number;
	}
	
	public void render() {
		IO io = new IO();
		if (iscovered()) {
			io.write("[" + getNumber() + "," + getCardSuite() + "]");
		} else {
			io.write("[X,X]");
		}
	}

	
	
	
	
	
}
