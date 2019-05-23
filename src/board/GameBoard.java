package board;

//import cardsDeck.Card;
import cardsDeck.Deck;

public class GameBoard {
	
	public Deck AllCards;
	
	public GameBoard(){
		
		AllCards = new Deck();
		AllCards.initPrimaryDestCard();
		AllCards.initWagonDeck();
		AllCards.initAllDest();
		
	}

}
