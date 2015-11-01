package Klondike;


public class MoveDecktoWasteView {
	
	private MoveDecktoWaste moveDecktoWaste;
	public MoveDecktoWasteView(Controller controller){
		this.moveDecktoWaste = (MoveDecktoWaste) controller;
	}
	
	
	public void render() {
		IO io = new IO();
		if (moveDecktoWaste.isDeckEmpty()) {
			io.writeln("ERROR!!! La baraja no tiene más cartas.");	
			return;
		}
		if (moveDecktoWaste.isWasteEmpty()){
			moveDecktoWaste.move();
		} else {
			io.writeln("ERROR!!! Ya hay cartas en el descarte.");
		}

	}
}
