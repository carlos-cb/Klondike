package Klondike;

public abstract class Controller {

protected Tableau tableau;
protected Board board;
	
	protected Controller(Board board){
		assert board != null;
		this.board = board;
	}
	
	public BoardForView getBoard(){
		return board;
	}
}
