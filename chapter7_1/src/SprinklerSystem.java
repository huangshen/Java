
class WaterSource {
	private String s;
	
	WaterSource() {
		System.out.print("WaterSource" + "\n");
		s = "Constructed";
	}
	
	public String toString() {
		return s;
	}
}

public class SprinklerSystem {
	private String value;
	private WaterSource source = new WaterSource();
	
	public String toString() {
		return "value = " + value + " " + "source = " + source; 
	}
	
	public static void main(String[] args) {
		SprinklerSystem sprinkler = new SprinklerSystem();
		//WaterSource water = new WaterSource();
		System.out.print(sprinkler);
		//System.out.print(water);
	}
}