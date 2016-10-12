package shenh.leet;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i = 0, j = 1;
        int[] ret ={0, 0};
Found: 
        for(i = 0; i < nums.length; i++) {
    		for(j = 1; j < nums.length; j++) {
    			if((nums[i] + nums[j]) == target && (i != j))
    				break Found;
    		}
    	}
   	
    	ret[0] = i;
    	ret[1] = j;
    	return ret;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2, 7, 11, 15};
		int target = 19;
		int[] sum;
		sum = twoSum(nums, target);
		System.out.println(sum[0] + "  " + sum[1]);
	}

}
