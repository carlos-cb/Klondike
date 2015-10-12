package Klondike;

public class MoveWastetoDeck extends MoveController {

	protected MoveWastetoDeck(Board board) {
		super(board);
	}

	@Override
	public void getrender(View view) {
		view.atender(this);
		
	}
	
	public void move(){
	}

}
