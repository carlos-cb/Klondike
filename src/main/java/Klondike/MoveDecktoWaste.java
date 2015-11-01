package Klondike;

public class MoveDecktoWaste extends MoveController {

	protected MoveDecktoWaste(Board board) {
		super(board);
	}
	
	public boolean isPosibleMove(DeckStack deckStack, WasteStack waste) {
		return board.sizeDeck() > 0;
	}
	
	DeckStack deckStack;
	WasteStack wasteStack;
	
	public  void move() {
		for (int i = 0; i < WasteStack.MAX_SIZE; i++) {
			Card card = deckStack.takeCardFromTop();
			card.turnover();
			wasteStack.putCardOnTop(card);			
		}
	}

	@Override
	public void getrender(View view) {
		view.atender(this);
		
	}
	
	public boolean isDeckEmpty() {
		return deckStack.isEmpty();
	}

	public boolean isWasteEmpty() {
		return wasteStack.isEmpty();
	}

}
