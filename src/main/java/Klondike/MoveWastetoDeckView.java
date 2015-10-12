package Klondike;

public class MoveWastetoDeckView {
	
	private MoveWastetoDeck moveWastetoDeck;
	
	public MoveWastetoDeckView(MoveWastetoDeck moveWastetoDeck){
		this.moveWastetoDeck = moveWastetoDeck;
	}

	public void render() {
		assert moveWastetoDeck.board.sizeDeck() == 0;
		moveWastetoDeck.move();
		
	}

}
