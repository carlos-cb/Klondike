package Klondike;

public interface View {
	void render();

	void atender(MoveDecktoWaste moveDecktoWaste);

	void atender(MoveWastetoDeck moveWastetoDeck);
	
	void atender(MoveWastetoSuite moveWastetoSuite);

	void atender(MoveWastetoTableau moveWastetoTableau);
	
	void atender(MoveTableautoSuite moveTableautoSuite);
	
	void atender(MoveTableautoTableau moveTableautoTableau);

	void atender(MoveSuitetoTableau moveSuitetoTableau);

}
