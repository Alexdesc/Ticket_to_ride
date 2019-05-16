package cardsDeck;

import java.util.ArrayList;
import java.util.List;

public class Deck {
	
	public ArrayList<Card> train = new ArrayList<>();
	
	public int nbCartesLoco = 14;
	
	public void init(){
		
		//init wagon deck cards
		List<String> wagonColor = new ArrayList<String>();
		wagonColor.add("red");
		wagonColor.add("blue");
		wagonColor.add("green");
		wagonColor.add("dark");
		wagonColor.add("white");
		wagonColor.add("orange");
		wagonColor.add("purple");
		wagonColor.add("yellow");
		
		for(String color : wagonColor){
			train.add(new Wagon(color,"url"));
		}
	
		//init locomotive
		for(int i = 0; i < nbCartesLoco ; i++){
			train.add(new Wagon("locomotive","url"));
		}
		
	}
	
	

}
