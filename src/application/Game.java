package application;

import java.util.ArrayList;

import board.GameBoard;
import board.Player;
import cardsDeck.Card;

public class Game {
	
	public int nbJoueurs;
	public ArrayList<Player> playersList;
	
	//Bring all element from the deck
	GameBoard g = new GameBoard();
	ArrayList<Card> PrimaryDest = g.AllCards.getDeckPrimaryDest();
	ArrayList<Card> Dest = g.AllCards.getDeckDest();
	ArrayList<Card> train = g.AllCards.getDeckTrain();
	
	public Game(int nbJoueurs){
		this.nbJoueurs = nbJoueurs;
		this.playersList = new ArrayList<Player>();
		
		for(int i = 0; i <= nbJoueurs; i++){
			playersList.add(new Player(null, i, 0));
		}
		initPlayer();
	}
	
	public void initPlayer(){
		for(Player p:playersList){
			p.PrimaryDest.add(g.AllCards.pickCard(PrimaryDest));
			for(int i=0;i<3;i++){
				p.handDestDeck.add(g.AllCards.pickCard(Dest));
			}
			for(int i=0;i<4;i++){
				p.handTrainDeck.add(g.AllCards.pickCard(train));
			}
			
			//tests
			/*for(Card d:p.PrimaryDest){
				System.out.println(d.getCityA()+ " to " + d.getCityB() + " for " + d.getptsValue());
			}
			System.out.println("xxxxxxxxxxxxx Dest xxxxxxxxxxxxxxx");
			for(Card d:p.handDestDeck){
				System.out.println(d.getCityA()+ " to " + d.getCityB() + " for " + d.getptsValue());
			}
			System.out.println("xxxxxxxxxxxxx colors xxxxxxxxxxxxxxx");
			for(Card d:p.handTrainDeck){
				System.out.println(d.getColor());
			}
			System.out.println("xxxxxxxxxxxxx next xxxxxxxxxxxxxxx");*/
		}
	}
	
	public void LessOneCard(int numPlayer,Card cardToLeave,String nameDeck){
		for(Player p:playersList){
			if(p.id == numPlayer){
				if(nameDeck=="primary"){
					g.AllCards.BigDest.add(cardToLeave);
					p.PrimaryDest.remove(cardToLeave);
				}else if(nameDeck=="dest"){
					g.AllCards.dest.add(cardToLeave);
					p.handDestDeck.remove(cardToLeave);
				}else if(nameDeck=="wagon"){
					g.AllCards.train.add(cardToLeave);
					p.handTrainDeck.remove(cardToLeave);
				}
			}
		}
	}

}
