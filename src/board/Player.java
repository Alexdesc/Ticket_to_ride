package board;

import java.util.ArrayList;

import cardsDeck.Card;

public class Player {
	
	public String name;
	public int id;
	public int score;
	
	public ArrayList<Card> handTrainDeck;
	public ArrayList<Card> handDestDeck;
	public ArrayList<Card> PrimaryDest;
	
	public Player(String nom, int id, int score){
		this.name = nom;
		this.id = id;
		this.score = score;
		this.handTrainDeck = new ArrayList<Card>();
		this.handDestDeck = new ArrayList<Card>();
		this.PrimaryDest = new ArrayList<Card>();
	}

}
