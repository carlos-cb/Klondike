package Klondike;

public abstract class Controller {

protected SuiteStack tableau;
protected Board board;
	
	protected Controller(Board board){
		assert board != null;
		this.board = board;
	}

}
