package Klondike;

public class MoveWastetoTableau extends MoveController {

	public MoveWastetoTableau(Board board) {
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
