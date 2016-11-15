package shenh.leet;

public class FindDifference {
    public char findTheDifference(String s, String t) {
    	int   i; 
    	int   idx;
    	int[] val;
    	char   c = 'a';
    	
    	val = new int[26];
    	
    	for(i=0;i<26;i++)
    		val[i] = 0;
    	
    	for(i=0;i<t.length();i++) {
    		idx = (int)(t.charAt(i) - 'a');
    		val[idx] += 1; 
    	}

    	for(i=0;i<s.length();i++) {
    		idx = (int)(s.charAt(i) - 'a');
    		val[idx] -= 1; 
    	}
    	
    	for(i=0;i<26;i++) {
    		if(val[i] != 0) {
    			c = (char)('a' + i);
    			break;
    		}
    	}
    	
        return c;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abedc";
		String t = "aefdbc";
		FindDifference o = new FindDifference();
		System.out.println(o.findTheDifference(s, t));
	}

}
