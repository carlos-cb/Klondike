package Klondike;

public class MoveControllerFactory {

	private Board board;
	private  MoveController[] moveControllers;
	
	public MoveControllerFactory(Board board){
		assert board != null;
		this.board = board;
		moveControllers = new MoveController[7];
		moveControllers[1] = new MoveDecktoWaste(board);
		moveControllers[2] = new MoveWastetoDeck(board);
		moveControllers[3] = new MoveWastetoSuite(board);
		moveControllers[4] = new MoveWastetoTableau(board);
		moveControllers[5] = new MoveTableautoSuite(board);
		moveControllers[6] = new MoveTableautoTableau(board);
		moveControllers[7] = new MoveSuitetoTableau(board);
		
	}
	
	public MoveController getController(int opcion){
		if(board.existKlondike()){
			return null;
		} 
		MoveController movecontroller = moveControllers[opcion];
		return movecontroller;
		
	}

	public void setOption(int option) {
		switch (option) {
		case 1:
			moveControllers[1] = new MoveDecktoWaste(board);
			break;
		case 2:
			moveControllers[2] = new MoveWastetoDeck(board);
			break;
		case 3:
			moveControllers[3] = new MoveWastetoSuite(board);
			break;
		case 4:
			moveControllers[4] = new MoveWastetoTableau(board);
			break;
		case 5:
			moveControllers[5] = new MoveTableautoSuite(board);
			break;
		case 6:
			moveControllers[6] = new MoveTableautoTableau(board);
			break;
		case 7:
			moveControllers[7] = new MoveSuitetoTableau(board);
			break;
		case 9:
			break;
		}
	}
}
