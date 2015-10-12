package Klondike;

public class MoveSuitetoTableau extends MoveController {

	protected MoveSuitetoTableau(Board board) {
		super(board);
	}

	public boolean isPosibleMove(int suite, int tableau) {
		return board.isPosibleMove(suite, tableau);
		
	}
	
	@Override
	public void getrender(View view) {
		view.atender(this);
		
	}

}
