import shenh.mypackage.*;
import static shenh.myutil.Print.*;

public class AccessControlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m = new MyClass();
		MyList list = new MyList();

		print("Trying myutil.Print");
		print(100);
		print(1.5);
		printnb(100 + " "); printnb(1.5 + " "); printnb("hello");
		print();
		printf("a = %d\n", 1);
	}
}
