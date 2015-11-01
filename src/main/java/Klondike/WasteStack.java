package Klondike;

public class WasteStack extends CardStack{

	public static final int MAX_SIZE = 3;
	
	public int getSize() {
		return 0;
	}

	@Override
	public boolean isValidOnTop(Card card) {
		return true;
	}
	
	@Override
	public void putCardOnTop(Card card) {
		if (this.getSize() < MAX_SIZE) {
			super.putCardOnTop(card);
		}
	}
	
	public void render() {
		IO io = new IO();
		if (isEmpty()) {
			io.write("<vacío>");
		} else {
			for (int i = 0; i < getSize(); i++) {
				new CardView(this.getCards().get(i)).render();
			}	
		}
	}

}
