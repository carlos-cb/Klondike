package Klondike;

public class MoveTableautoSuite extends MoveController {

	protected MoveTableautoSuite(Board board) {
		super(board);
	}

	@Override
	public void getrender(View view) {
		view.atender(this);
		
	}

	public boolean isPosibleMove(int escalera) {
		return board.isPosibleMove(escalera);
	}

}
