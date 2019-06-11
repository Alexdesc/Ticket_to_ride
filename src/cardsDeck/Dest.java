package cardsDeck;

public class Dest extends Card{

	//This type of card are objectives to reach to have some definit point
	protected String cityA;
	protected String cityB;
	
	protected String imagePath;
	
	protected int ptsValue;
	
	public Dest(String citiA, String citiB, String imagePath, int pts){
		this.cityA = citiA;
		this.cityB = citiB;
		this.imagePath = imagePath;
		this.ptsValue = pts;
	}
	
	public String getCityA() {
		return cityA;
	}

	public String getCityB() {
		return cityB;
	}
	
	public int getptsValue() {
		return ptsValue;
	}

}
