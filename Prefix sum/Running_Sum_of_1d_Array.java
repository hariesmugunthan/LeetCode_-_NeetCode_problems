package array;

public class Running_Sum_of_1d_Array {

	public static void main(String[] args) {
		
		int[] nums = {11, 92, 83, 64};
		Solution sol = new Solution();
        int[] result = sol.runningSum(nums);
	    System.out.print("Running Sum: ");
	        for (int val : result) {
	            System.out.print(val + " ");
	        }

	}

}
class Solution {
    public int[] runningSum(int[] nums) {
        int[] p=new int[nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        return p;
    }
}
