package Klondike;

public class MoveTableautoTableau extends MoveController {

	protected MoveTableautoTableau(Board board) {
		super(board);
	}

	@Override
	public void getrender(View view) {
		view.atender(this);
		
	}

	public boolean isPosibleMove(int originTableau, int tagetStraight) {
		return board.isPosibleMove(originTableau, tagetStraight);
	}

}
