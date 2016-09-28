
class Shape {
	Shape(int i) {
		System.out.println("Shape " + i + " constructor");
	}
	
	void dispose() {
		System.out.println("Shape dispose");
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		System.out.println("Circle " + i + " constructor");
	}
	
	void dispose() {
		super.dispose();
		System.out.println("Circle dispose");
	}
}

public class CadSystem {
	private Circle c;
	public CadSystem(int i) {
		c = new Circle(i+1);
		System.out.println("CadSystem " + i + " constructor");
	}
	
	public void dispose() {
		c.dispose();
		System.out.println("CadSystem dispose");
	}

}
