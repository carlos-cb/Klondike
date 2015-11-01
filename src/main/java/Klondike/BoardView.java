package Klondike;

import java.util.ArrayList;

public class BoardView {
	
	private Board board;
	DeckStack deck;
	WasteStack waste;
	ArrayList<SuiteStack> foundations;
	ArrayList<SuiteView> suites;
	
	public BoardView(Board board) {
		this.board = board;
	}

	public void render() {
		IO io = new IO();
		io.writeln("===========================");
		io.write("Baraja: ");
		new DeckStack().render();
		io.writeln();
		io.write("Descarte: ");
		new WasteStack().render();
		io.writeln();
		io.write("Palo oros: ");
		new SuiteView(foundations.get(0)).render();
		io.writeln();
		io.write("Palo copas: ");
		new SuiteView(foundations.get(1)).render();
		io.writeln();
		io.write("Palo espadas: ");
		new SuiteView(foundations.get(2)).render();
		io.writeln();
		io.write("Palo bastos: ");
		new SuiteView(foundations.get(3)).render();
		io.writeln();
		for (int i = 0; i < 7; i++) {
			io.write("Escalera " + (i + 1) + ": ");	
			io.writeln();
		}
		io.writeln("---------------------------");
	}
		
}
