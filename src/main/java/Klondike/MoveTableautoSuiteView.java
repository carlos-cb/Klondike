package Klondike;

public class MoveTableautoSuiteView {

    private MoveTableautoSuite moveTableautoSuite;
	
	public MoveTableautoSuiteView(MoveTableautoSuite moveTableautoSuite){
		this.moveTableautoSuite = moveTableautoSuite;
	}
	
	
	public void render() {
		int escalera;
		escalera = new LimitedIntDialog("De qué escalera [1-7]",1,7).read();
		boolean ok = moveTableautoSuite.isPosibleMove(escalera);
		if(!ok){
			new IO().writeln("No se puede realizar este paso");
		}else{
			if(moveTableautoSuite.getboard().existKlondike()){
				new IO().writeln("HAS GANADO!!!");
			}
			else{
				return;
			}
		}
		
	}
}
