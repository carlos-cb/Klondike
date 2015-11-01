package Klondike;

public class CardView {

private Card card;
	
	public CardView(Card card) {
		this.card = card;
	}
	
	public void render() {
		IO io = new IO();
		if (card.iscovered()) {
			io.write("[" + card.getNumber() + "," + card.getCardSuite() + "]");
		} else {
			io.write("[X,X]");
		}
	}
}
