
class Soap {
	private String s;
	Soap() {
		System.out.println("Soap Constructor");
		s = "Constructored";
	}
	public String toString() {
		return s;
	}
}

class Bath {
	// Initializing the object while it has been defined
	private String s1 = "s1", 
			s2, s3, s4;
	
	Bath() {
		// Initializing the object in constructor function
		s2 = "s2";
		System.out.println("Bath Constructor");
	}
	
	// Instance initialization
	{s3 = "s3";}
	
	public String toString() {
		// Delayed initialization
		if(s4 == null)
			s4 = "s4";
		
		return s1 + " " + s2 + " " + s3 + " " + s4;
	}
}

public class ResuingClassesDemo {
	public static void main(String[] args) {
		// Demo for Composition
		SprinklerSystem sprinkler = new SprinklerSystem();
		//WaterSource water = new WaterSource();
		System.out.println(sprinkler);
		//System.out.print(water);
		
		// Demo for initial methods
		Bath b = new Bath();
		System.out.println(b);
		
		// Demo for inheritance
		Cleanser c = new Cleanser();
		c.dilute();
		System.out.println(c);
		
		Detergent d = new Detergent();
		d.dilute();
		System.out.println(d);
		
	}
}
