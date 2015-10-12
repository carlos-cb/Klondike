package Klondike;

public class Waste extends CardStack{

	private static final long serialVersionUID = 1L;
	
	@Override
	public boolean canPush(Card card) {
		if(!card.iscovered()) return true;
		return false;
    }
}
