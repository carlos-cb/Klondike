package Klondike;

public class MoveWastetoTableauView {

    private MoveWastetoTableau moveWastetoTableau;
	
	public MoveWastetoTableauView(MoveWastetoTableau moveWastetoTableau){
		this.moveWastetoTableau = moveWastetoTableau;
	}
	
	
	public void render() {
		int escalera;
		escalera = new LimitedIntDialog("A qué escalera",1,7).read();
		boolean ok = moveWastetoTableau.isPosibleMove(escalera);		
		if(!ok){
			new IO().writeln("No se puede realizar este paso");
		}else{
			if(moveWastetoTableau.getboard().existKlondike()){
				new IO().writeln("HAS GANADO!!!");
			}
			else{
				return;
			}
		}
		
	}
}
