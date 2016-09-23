import java.util.*;

public class Controlling {

	static int test(int testval, int target) {
		if(testval > target)
			return 1;
		else if(testval < target)
			return -1;
		else
			return 0;
	}
	
	static void testfor() {
		char c;
		for(c=0;c<128;c++) {
			if(Character.isLowerCase(c)) {
				System.out.println("value: " + (int)c + " Char: " +  c);
			}
		}
	}

	static void testforeach() {
		Random rand = new Random(47);
		float f[] = new float[10];
		
		for(int i = 0; i < 10; i++)
			f[i] = rand.nextFloat();
		
		for(float x : f)
			System.out.println(x);
	}
	
	public static void main(String[] args) {

		int result;
		result = test(0, 1);
		System.out.println(result);
		result = test(10,10);
		System.out.println(result);
		result = test(1, 0);
		System.out.println(result);
		
		testfor();
		
		testforeach();
	}

}
