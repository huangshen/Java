
public class Cleanser {
	private String name = "Cleanser";
	
	Cleanser() {
		System.out.println(name + " Constructed");
	}
	
	private void append(String s) {
		name += s;
	}
	
	public void dilute() {
		name += " dilute()";
	}
	
	public String toString() {
		return name;
	}
}
