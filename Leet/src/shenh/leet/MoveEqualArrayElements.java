package shenh.leet;

public class MoveEqualArrayElements {
    public int minMoves(int[] nums) {
    	int n = nums.length;
    	int i, sum = 0;
    	int count = 0;
    	int min = nums[0];
    	
    	for(i=0; i<n; i++) {
    		sum += nums[i];
    		if(nums[i] < min)
    			min = nums[i];
    	}
    	
        return sum - min * n;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ret;
		MoveEqualArrayElements o = new MoveEqualArrayElements();
		int[] a = {-10, -9, 3, 4};
		ret = o.minMoves(a);
		System.out.println(ret);
	}

}
