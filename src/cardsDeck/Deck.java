package cardsDeck;

import java.util.ArrayList;
import java.util.Collections;

public class Deck{
	
	//Deck of wagon cards
	public ArrayList<Card> train;
	//Deck of destination cards
	public ArrayList<Card> dest;
	//Deck of primary Dest cards
	public ArrayList<Card> BigDest;
	//Number of locomotives cards in the wagon deck cards
	public int nbCartesLoco = 14;
	
	
	public void initWagonDeck(){
		
		train = new ArrayList<Card>();
		int nbOfIteration = 12;
		
		//init wagon deck cards
		for(int i = 0; i < nbOfIteration; i++){
			train.add(new Wagon("red","/Projet/src/ressources_wagon/wagon_red.png"));
			train.add(new Wagon("blue","/Projet/src/ressources_wagon/wagon_blue.png"));
			train.add(new Wagon("green","/Projet/src/ressources_wagon/wagon_green.png"));
			train.add(new Wagon("black","/Projet/src/ressources_wagon/wagon_black.png"));
			train.add(new Wagon("white","/Projet/src/ressources_wagon/wagon_white.png"));
			train.add(new Wagon("orange","/Projet/src/ressources_wagon/wagon_orange.png"));
			train.add(new Wagon("purple","/Projet/src/ressources_wagon/wagon_purple.png"));
			train.add(new Wagon("yellow","/Projet/src/ressources_wagon/wagon_yellow.png"));
		}
		//Add locomotives
		for(int i = 0; i < nbCartesLoco ; i++){
			train.add(new Wagon("locomotive","/Projet/src/ressources_wagon/wagon_locomotive.png"));
		}
		
		Collections.shuffle(train);
		//System.out.println(train.size());
	}
	
	public void initPrimaryDestCard(){
		
		BigDest = new ArrayList<Card>();
		//init primary destination deck
		BigDest.add(new Dest("Brest", "Petrograd", "/Projet/src/ressources_primary_dest/brest-petrograd.png", 20));
		BigDest.add(new Dest("Cadiz", "Stockholm", "/Projet/src/ressources_primary_dest/cadiz-stockholm.png", 21));
		BigDest.add(new Dest("Edinburgh", "Athina", "/Projet/src/ressources_primary_dest/edinburgh-athina.png", 21));
		BigDest.add(new Dest("Kobenhavn", "Erzurum", "/Projet/src/ressources_primary_dest/kobenhavn-erzurum.png", 21));
		BigDest.add(new Dest("Lisboa", "Danzig", "/Projet/src/ressources_primary_dest/lisboa-danzig.png", 20));
		BigDest.add(new Dest("Palermo", "Moskva", "/Projet/src/ressources_primary_dest/palermo-moskva.png", 20));
		
		Collections.shuffle(BigDest);
		//System.out.println(BigDest.size());
	}
	
	public void initAllDest(){
		
		dest = new ArrayList<Card>();
		//init dest deck
		dest.add(new Dest("amsterdam", "pamplona", "/Projet/src/ressources_dest/amsterdam-pamplona.png", 7));
		dest.add(new Dest("amsterdam", "wilno", "/Projet/src/ressources_dest/amsterdam-wilno.png", 12));
		dest.add(new Dest("angora", "kharkov", "/Projet/src/ressources_dest/angora-kharkov.png", 10));
		dest.add(new Dest("athina", "angora", "/Projet/src/ressources_dest/athina-angora.png", 5));
		dest.add(new Dest("athina", "wilno", "/Projet/src/ressources_dest/athina-wilno.png", 11));
		dest.add(new Dest("barcelona", "bruxelles", "/Projet/src/ressources_dest/barcelona-bruxelles.png", 8));
		dest.add(new Dest("barcelona", "munchen", "/Projet/src/ressources_dest/barcelona-munchen.png", 8));
		dest.add(new Dest("berlin", "bucuresti", "/Projet/src/ressources_dest/berlin-bucuresti.png", 8));
		dest.add(new Dest("berlin", "moskva", "/Projet/src/ressources_dest/berlin-moskva.png", 12));
		dest.add(new Dest("berlin", "roma", "/Projet/src/ressources_dest/berlin-roma.png", 9));
		
		dest.add(new Dest("brest", "marseille", "/Projet/src/ressources_dest/brest-marseille.png", 7));
		dest.add(new Dest("brest", "venezia", "/Projet/src/ressources_dest/brest-venezia.png", 8));
		dest.add(new Dest("bruxelles", "danzig", "/Projet/src/ressources_dest/bruxelles-danzig.png", 9));
		dest.add(new Dest("budapest", "sofia", "/Projet/src/ressources_dest/budapest-sofia.png", 5));
		dest.add(new Dest("edinburgh", "paris", "/Projet/src/ressources_dest/edinburgh-paris.png", 7));
		dest.add(new Dest("essen", "kyiv", "/Projet/src/ressources_dest/essen-kyiv.png", 10));
		dest.add(new Dest("frankfurt", "kobenhavn", "/Projet/src/ressources_dest/frankfurt-kobenhavn.png", 5));
		dest.add(new Dest("frankfurt", "smolensk", "/Projet/src/ressources_dest/frankfurt-smolensk.png", 13));
		dest.add(new Dest("kyiv", "petrograde", "/Projet/src/ressources_dest/kyiv-petrograde.png", 6));
		dest.add(new Dest("kyiv", "sochi", "/Projet/src/ressources_dest/kyiv-sochi.png", 8));
		
		dest.add(new Dest("london", "berlin", "/Projet/src/ressources_dest/london-berlin.png", 7));
		dest.add(new Dest("london", "wien", "/Projet/src/ressources_dest/london-wien.png", 10));
		dest.add(new Dest("madrid", "dieppe", "/Projet/src/ressources_dest/madrid-dieppe.png", 8));
		dest.add(new Dest("madrid", "zurich", "/Projet/src/ressources_dest/madrid-zurich.png", 8));
		dest.add(new Dest("marseille", "essen", "/Projet/src/ressources_dest/marseille-essen.png", 8));
		dest.add(new Dest("palermo", "constantinople", "/Projet/src/ressources_dest/palermo-constantinople.png", 8));
		dest.add(new Dest("paris", "wien", "/Projet/src/ressources_dest/paris-wien.png", 8));
		dest.add(new Dest("paris", "zagrab", "/Projet/src/ressources_dest/paris-zagrab.png", 7));
		dest.add(new Dest("riga", "bucuresti", "/Projet/src/ressources_dest/riga-bucuresti.png", 10));
		dest.add(new Dest("roma", "smyrna", "/Projet/src/ressources_dest/roma-smyrna.png", 8));
		
		dest.add(new Dest("rostov", "erzurum", "/Projet/src/ressources_dest/rostov-erzurum.png", 5));
		dest.add(new Dest("sarajevo", "sevastopol", "/Projet/src/ressources_dest/sarajevo-sevastopol.png", 8));
		dest.add(new Dest("smolensk", "rostov", "/Projet/src/ressources_dest/smolensk-rostov.png", 8));
		dest.add(new Dest("sofia", "smyrna", "/Projet/src/ressources_dest/sofia-smyrna.png", 5));
		dest.add(new Dest("stockholm", "wien", "/Projet/src/ressources_dest/stockholm-wien.png", 11));
		dest.add(new Dest("venezia", "constantinople", "/Projet/src/ressources_dest/venezia-constantinople.png", 10));
		dest.add(new Dest("warszawa", "smolensk", "/Projet/src/ressources_dest/warszawa-smolensk.png", 6));
		dest.add(new Dest("zagrab", "brindisi", "/Projet/src/ressources_dest/zagrab-brindisi.png", 6));
		dest.add(new Dest("zurich", "brindisi", "/Projet/src/ressources_dest/zurich-brindisi.png", 6));
		dest.add(new Dest("zurich", "budapest", "/Projet/src/ressources_dest/zurich-budapest.png", 6));
		
		Collections.shuffle(dest);
		//System.out.println(dest.size());
	}
	
	public Card pickCard(ArrayList<Card> cardToPick){
		Card theCard = cardToPick.get(0);
		cardToPick.remove(0);
		return theCard;
	}
	
	public ArrayList<Card> getDeckTrain(){
		return this.train;
	}
	
	public ArrayList<Card> getDeckPrimaryDest(){
		return this.BigDest;
	}
	
	public ArrayList<Card> getDeckDest(){
		return this.dest;
	}
	

}
