package Klondike;

public class FoundationStack extends CardStack{

	private CardSuite cardSuite;
	
	public void Foundation (CardSuite cardSuite) {
		this.cardSuite = cardSuite;
	}
	
	@Override
	public boolean isValidOnTop(Card card) {

		if (!card.iscovered() || card.getCardSuite() != this.cardSuite) {
			return false;
		}
	
		if (this.isEmpty() && card.getNumber() == Number.AS) {
			return true;
		}
		
		if (!this.isEmpty() && 
				this.viewCardFromTop().getNumber().getValue() < 
					card.getNumber().getValue()) {
			return true;
		}
		
		return false;
	}
	
	public void render() {
		IO io = new IO();
		if (isEmpty()) {
			io.write("<vacío>");
		}
	}

}
