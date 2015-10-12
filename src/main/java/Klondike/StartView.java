package Klondike;

public class StartView {

	private StartController startController;
	
	public StartView(StartController startController) {
		this.startController = startController;
	}
	public void render() {
		IO io = new IO();
		new BoardView(startController.getBoard()).render();
		io.writeln("---------------------------");
		io.writeln("1. Mover de baraja a descarte");
		io.writeln("2. Mover de descarte a baraja");
		io.writeln("3. Mover de descarte a palo");
		io.writeln("4. Mover de descarte a escalera");
		io.writeln("5. Mover de escalera a palo");
		io.writeln("6. Mover de escalera a escalera");
		io.writeln("7. Mover de palo a escalera");
		io.writeln("8. Voltear en escalera");
		io.writeln("9. Salir");
		int option = new LimitedIntDialog("Seleccione la Opción del 1 al 9", 1, 9).read();
		if(option == 9){
			io.write("Adios!!!");
			System.exit(0);
		}
		StartController.control(option);
		
	}
	
}
