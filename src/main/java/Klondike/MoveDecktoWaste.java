package Klondike;

public class MoveDecktoWaste extends MoveController {

	protected MoveDecktoWaste(Board board) {
		super(board);
	}
	
	public boolean isPosibleMove(DeckStack deckStack, Waste waste) {
		return board.sizeDeck() > 0;
	}
	
	
	public  void move(DeckStack from, Waste to) {
		assert board.sizeDeck() > 0;
		from.peek().setCovered(false);
		if(to.canPush(from.peek())){
			to.push(from.pop());			
		}
	}
	
	public boolean move(CardStack from, CardStack to) {
		if(to.canPush(from.peek())){
			to.push(from.pop());
			return true;
		}
		return false;
	}

	@Override
	public void getrender(View view) {
		view.atender(this);
		
	}

}
