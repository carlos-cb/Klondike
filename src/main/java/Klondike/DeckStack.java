package Klondike;

public class DeckStack extends CardStack{

	public static final int MAX_CARDS = 52;
		
	public DeckStack(){
		for (CardSuite cardSuite : CardSuite.values()){
			for (Number number : Number.values()) {
				this.putCardOnTop(new Card(number, cardSuite));
			}	
		}
	}

	public void putCardOnBottom(Card card) {
		this.getCards().insertElementAt(card, 0);
	}
		
	@Override
	public boolean isValidOnTop(Card card) {
		if (this.getSize() < MAX_CARDS) {
			return true;
		}
		return false;
	}

	public void render() {
		IO io = new IO();
		if (isEmpty()) {
			io.write("<vacio>");
		} else{
			CardView cardView = new CardView(viewCardFromTop());
			cardView.render();
		}
	}
}
