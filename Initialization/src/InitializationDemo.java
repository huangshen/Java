// Demonstration of constructor method
class Rock {
	static int nRocks = 0;
	Rock() {
		nRocks += 1;
		System.out.println(nRocks + " Rocks");
	}
}

// Demonstration of method overloading 
class Tree {
	static int nHeight;
	Tree() {
		System.out.println("Planting a seed.");
		nHeight = 0;
	}
	
	Tree(int height) {
		System.out.println("Planting a tree that is " + height + " feet high.");
		nHeight = height;
	}
}

// Demonstration of "this" keyword
class Leaf {
	int i;
	Leaf increment() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i = " + i);
	}
}

class Flower {
	int nPetals = 0;
	String s = "Initial value.";
	Flower(int petal) {
		nPetals = petal;
		System.out.println("Constructor with int only. nPetals = " + nPetals);
	}
	Flower(String ss) {
		s = ss;
		System.out.println("Constructor with String only. s = " + s);
	}
	Flower(String ss, int petal) {
		this(petal);
		this.s = ss;
		System.out.println("Constructor with String and int");
	}
	Flower() {
		this("unknown flower", 0);
		System.out.println("Constructor with no parameter.");
	}
}

// Demonstration of charpter "Initialization & Cleanup"
public class InitializationDemo {

	public static void main(String[] args) {

		for(int i=0;i<8;i++) {
			new Rock();
		}

		new Tree();
		new Tree(10);
		
		Leaf l = new Leaf();
		l.increment().increment().increment().print();
		
		Flower f1 = new Flower(5);
		Flower f2 = new Flower("Red rose.");
		Flower f3 = new Flower("White rose", 11);
		Flower f4 = new Flower();
	}

}
