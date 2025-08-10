package Array;

import java.util.Arrays;

class Concatination {
	public int[] getConcatenation(int[] nums) {
        int [] ans= new int[nums.length*2];
        int idx=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<nums.length;j++){
                ans[idx]=nums[j];
                idx++;
            }

        }
        return ans;
        
    }
	 public static void main(String[] args) {
	        Concatination o1 = new Concatination();
	        int[] nums = {99,34,54,65,45,34};
	        int[] result = o1.getConcatenation(nums);
	        System.out.println(Arrays.toString(result));
	    }

}
