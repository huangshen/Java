package shenh.strings;

import java.util.*;

public class UsingStringBuilder {
	private Random rand = new Random(10); 
	public String toString() {
		int i;
		StringBuilder sb = new StringBuilder();

		for(i = 0; i < 10; i++) {
			sb.append(rand.nextInt(100));
			sb.append(", ");
		}
		
		sb.delete(sb.length()-2, sb.length());
		
		return sb.toString();
	}

}
