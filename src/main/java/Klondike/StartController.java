package Klondike;

public class StartController extends Controller{

	static MoveControllerFactory moveControllerFactory;

	
	public StartController(Board board, MoveControllerFactory moveControllerFactory){
	
		super(board);
		StartController.moveControllerFactory = moveControllerFactory;
	}
	

	public Board getBoard() {
		return board;
	}

	public static void control(int option) {
		moveControllerFactory.setOption(option);
		
	}

}
