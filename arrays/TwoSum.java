package Array;

import java.util.Arrays;

public class TwoSum {

	
		

	int [] a = new int[2];

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        if (i < j) {
                            a[0] = i;
                            a[1] = j;
                        } else {
                            a[0] = j;
                            a[1] = i;
                        }
                    }
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
    	TwoSum sol = new TwoSum();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}


