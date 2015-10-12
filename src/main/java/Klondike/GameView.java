package Klondike;

public class GameView implements View{

	private MoveControllerFactory moveControllerFactory;
	private Board board;
	
	public GameView(MoveControllerFactory moveControllerFactory, Board board) {
		this.moveControllerFactory = moveControllerFactory;
		this.setBoard(board);
	}

	public void render() {
		MoveController controller;
		do{
			controller = moveControllerFactory.getController(0);
			if(controller != null){
				controller.getrender(this);
			}
		}while(controller != null);
		
	}

	@Override
	public void atender(MoveDecktoWaste moveDecktoWaste) {
		new MoveDecktoWasteView(moveDecktoWaste).render();
		
	}

	@Override
	public void atender(MoveWastetoDeck moveWastetoDeck) {
		new MoveWastetoDeckView(moveWastetoDeck).render();
		
	}

	@Override
	public void atender(MoveWastetoSuite moveWastetoSuite) {
		new MoveWastetoSuiteView(moveWastetoSuite).render();
		
	}

	@Override
	public void atender(MoveWastetoTableau moveWastetoTableau) {
		new MoveWastetoTableauView(moveWastetoTableau).render();
		
	}

	@Override
	public void atender(MoveTableautoSuite moveTableautoSuite) {
		new MoveTableautoSuiteView(moveTableautoSuite).render();
		
	}

	@Override
	public void atender(MoveTableautoTableau moveTableautoTableau) {
		new MoveTableautoTableauView(moveTableautoTableau).render();
		
	}

	@Override
	public void atender(MoveSuitetoTableau moveSuitetoTableau) {
		new MoveSuitetoTableauView(moveSuitetoTableau).render();
		
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

}
