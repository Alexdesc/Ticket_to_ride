package cardsDeck;

public class Wagon extends Card {
	
	protected String color;
	
	protected String imagePath;
	
	public Wagon(String color, String url) {
		this.color = color;
		this.imagePath = url;
	}
}
