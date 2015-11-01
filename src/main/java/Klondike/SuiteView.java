package Klondike;

public class SuiteView {

	private SuiteStack suite;
	
	public SuiteView(SuiteStack suite){
		this.suite = suite;
	}
	
	public void render(){
		IO io = new IO();
		if (suite.isEmpty()) {
			io.write("<vacío>");
		} else {
			for (int i = 0; i < (suite.getSize() - 1); i++) {
				Card card = suite.getCards().get(i);
				if (card.iscovered()) {
					new CardView(card).render();
				} else {
					io.write("[");
				}
			}
			new CardView(suite.viewCardFromTop()).render();
		}
	}
	
}
