package Klondike;

public class MoveWastetoSuiteView {

    private MoveWastetoSuite moveWastetoSuite;
	
	public MoveWastetoSuiteView(MoveWastetoSuite moveWastetoSuite){
		this.moveWastetoSuite = moveWastetoSuite;
	}

	public void render() {
		moveWastetoSuite.move();
		
	}
	
}
