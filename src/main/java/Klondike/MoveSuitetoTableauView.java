package Klondike;

public class MoveSuitetoTableauView {

	private MoveSuitetoTableau moveSuitetoTableau;
	
	public MoveSuitetoTableauView(MoveSuitetoTableau moveSuitetoTableau){
		this.moveSuitetoTableau = moveSuitetoTableau;
	}
	
	
	public void render() {
		int suite;
		suite = new LimitedIntDialog("De qué palo? [0-Oros, 1-Copas, 2-Espadas, 3-Bastos]",1,3).read();
		int tableau;
		tableau = new LimitedIntDialog("A qué escalera [1-7]",1,7).read();
		boolean ok = moveSuitetoTableau.isPosibleMove(suite,tableau);
		if(!ok){
			new IO().writeln("No se puede realizar este paso");
		}else{
			if(moveSuitetoTableau.getboard().existKlondike()){
				new IO().writeln("HAS GANADO!!!");
			}
			else{
				return;
			}
		}
		
	}
		
}
	
