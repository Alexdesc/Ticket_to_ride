package board;

import cardsDeck.Deck;

public class GameBoard {
	
	public Deck AllCards;
	
	public GameBoard(){
		
		AllCards = new Deck();
		AllCards.initPrimaryDestCard();
		AllCards.initWagonDeck();
		AllCards.initAllDest();
		
	}
	
	public Deck getDeck(){
		return this.AllCards;
	}

}
