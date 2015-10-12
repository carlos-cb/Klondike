package Klondike;

public class MoveTableautoTableauView {

    private MoveTableautoTableau moveTableautoTableau;
	
	public MoveTableautoTableauView(MoveTableautoTableau moveTableautoTableau){
		this.moveTableautoTableau = moveTableautoTableau;
	}
	
	
	public void render() {
		int originTableau;
		originTableau = new LimitedIntDialog("De qué escalera [1-7]",1,7).read();
		int tagetStraight;
		tagetStraight = new LimitedIntDialog("A qué escalera [1-7]",1,7).read();
		boolean ok = moveTableautoTableau.isPosibleMove(originTableau,tagetStraight);
		if(!ok){
			new IO().writeln("No se puede realizar este paso");
		}else{
			if(moveTableautoTableau.getboard().existKlondike()){
				new IO().writeln("HAS GANADO!!!");
			}
			else{
				return;
			}
		}
		
	}
}
