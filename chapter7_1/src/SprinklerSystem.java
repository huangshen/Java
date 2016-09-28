
class WaterSource {
	private String s;
	
	WaterSource() {
		System.out.print("WaterSource constructo" + "\n");
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
}