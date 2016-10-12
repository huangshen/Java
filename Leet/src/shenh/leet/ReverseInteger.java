package shenh.leet;

public class ReverseInteger {
    public int reverse(int x) {
    	boolean flag = true;
    	int ret = 0;
    	long reverse = 0;
    	
    	if(x < 0) {
    		flag = false;
    		x = -x;
    	}
    	
    	while(x > 0) {
    		reverse = reverse * 10 + x % 10;
    		x = x / 10;
    	}

    	if(flag == false)
    		reverse = -reverse;
    	
    	if(reverse > 2147483647)
    		ret = 0;
    	else if(reverse < -2147483648)
    		ret = 0;
    	else
    		ret = (int)reverse;
    	
        return ret;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int ret = 0;
		ReverseInteger obj = new ReverseInteger();
		
		ret = obj.reverse(x);
		System.out.println(x + " --> " + ret);

		x = 2016;
		ret = obj.reverse(x);
		System.out.println(x + " --> " + ret);
		
		x = -2050;
		ret = obj.reverse(x);
		System.out.println(x + " --> " + ret);
		
		x = 1534236469;
		ret = obj.reverse(x);
		System.out.println(x + " --> " + ret);
	}

}
