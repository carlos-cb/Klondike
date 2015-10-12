package Klondike;

public class BoardView {
	
	private Board board;
	MoveControllerFactory moveControllerFactory;

	public BoardView(Board board) {
		this.board = board;
	}

	public void render() {
		IO io = new IO();
		io.writeln("===========================");
		io.write("Baraja: ");
		if(board.sizeDeck()>0){
			 io.write("[X,X] \n");
		}else{
			writeEmpty(io);
		}
		io.write("Descarte: ");
		if(board.sizeWaste()>0){
			for(int i=0; i<board.sizeWaste();i++){
				io.write("["+board.getWaste().peek().getValue()+","+board.getWaste().peek().getCardSuite()+"]");
			}
			io.write("\n");
		}else{
			writeEmpty(io);
		}
		for(int i=0; i<4; i++){
			io.write("Palo "+ board.getSuite(i).getName().toString()+": ");
			if(board.getSuite(i).getSize()>1){
				Card card = board.getSuite(i).getLastCard();
				io.write("["+card.getValue()+","+card.getCardSuite()+"]");
			}else{
				writeEmpty(io);
			}
		}
		for(int i=0; i<board.getTableaus().get(i).size(); i++){
			Tableau escalera = board.getTableau();
			if(escalera.size() == 0){
				writeEmpty(io);
			}
			io.write("Escalera "+i+": ");
			for(int j=0; j<escalera.getCoveredCards();j++){
				io.write("[");
			}
			io.write("["+escalera.peek().getValue()+","+escalera.peek().getCardSuite()+"]\n");
		}
	}
	public void writeEmpty(IO io){
		io.write("<vacío> \n");
	}
}
