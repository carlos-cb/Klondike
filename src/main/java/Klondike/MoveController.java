package Klondike;

public abstract class MoveController extends Controller{

	protected MoveController(Board board) {
		super(board);
	}
	public abstract void getrender(View view);
	
	public Board getboard(){
		return board;
	}

}