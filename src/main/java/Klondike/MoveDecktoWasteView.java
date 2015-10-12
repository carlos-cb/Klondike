package Klondike;

public class MoveDecktoWasteView {

	private MoveDecktoWaste moveDecktoWaste;
	private Board board;
	public MoveDecktoWasteView(Controller controller){
		this.moveDecktoWaste = (MoveDecktoWaste) controller;
	}
	
	
	public void render() {
		moveDecktoWaste.move(board.getDeckStack(), board.getWaste());

	}
}
