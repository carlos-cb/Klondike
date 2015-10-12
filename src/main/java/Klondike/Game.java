package Klondike;

public class Game {
	
	private Board board;
	
	private StartController startController;
	private MoveControllerFactory moveControllerFactory;
	
	private StartView startView;
	private GameView gameView;
	
	public Game(){
		board = new Board();
		setStartController(new StartController(board, moveControllerFactory));
		moveControllerFactory = new MoveControllerFactory(board);
		gameView = new GameView(moveControllerFactory,board);
	}
	
	public void play(){
		startView.render();
		gameView.render();
	}
	
	public static void main(String[] args) {
		new Game().play();
	}

	public StartController getStartController() {
		return startController;
	}

	public void setStartController(StartController startController) {
		this.startController = startController;
	}
	
}
