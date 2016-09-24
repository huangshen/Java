import java.util.*;

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

// Demonstration of finalize()
class Book {
	boolean checkedOut = false;
	Book(boolean checkout) {
		checkedOut = checkout;
	}
	void checkin() {
		checkedOut = false;
	}
	protected void finalize() {
		if(checkedOut == true) {
			System.out.println("Error: checkout");
		}
	}
}

// Demonstration of initialization orders
class Window {
	Window(int num) {
		System.out.println("Window " + num);
	}
}

class House {
	Window w1 = new Window(1);
	House() {
		System.out.println("House");
		w3 = new Window(33);
	}
	Window w2 = new Window(2);
	void f() {
		System.out.println("f()");
	}
	Window w3 = new Window(3);
}

class Other {
	public static void main(String[] args) {
		for(String s : args) {
			System.out.println(s);
		}
	}
}

// Creating variable argument list
class NewVarArgs {
	static void printArray(Object... args) {
		for(Object obj : args) {
			System.out.print(obj + "  ");
		}
		System.out.println();
	} 
}

// Enum
enum Spiciness {
	NOT, MILD, MEDIUM, HOT, FLAMING
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
		
		new Book(true);
		System.gc();
		
		House house = new House();
		house.f();
		
		// Demo of array
		int a1[] = {1, 2, 3, 4, 5};
		int a2[];
		a2 = a1;
		
		for(int i = 0; i < 5; i++) {
			a2[i] = a2[i] + 1;
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println(a1[i]);
		}
		
		// Creating array with new
		int[] a;
		Random rand = new Random(48);
		a = new int[rand.nextInt(10)];
		
		System.out.println("a.length = " + a.length);		

		for(int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(100);
		}
		
		System.out.println(Arrays.toString(a));
		
		// Array initialization
		Integer[] c = {
				new Integer(1),
				new Integer(2),
				3,
		};
		
		Integer[] d = new Integer[] {
				new Integer(1),
				new Integer(2),
				3,
		};
		
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		
		Other.main(new String[] {"aaa", "bbb", "ccc"});
		
		NewVarArgs.printArray(1, 2);
		NewVarArgs.printArray("one", "two", "three");
		NewVarArgs.printArray(new Window(11), new Window(12), new Window(13));
		
		for(Spiciness s : Spiciness.values()) {
			System.out.println(s + ", odinal = " + s.ordinal() );
		}
	}

}
