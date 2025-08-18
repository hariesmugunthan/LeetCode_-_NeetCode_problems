package Array;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
        int idx = 0; // write pointer
        for (int i = 0; i < nums.length; i++) { // read pointer
            if (nums[i] != val) {
                nums[idx++] = nums[i];
            }
        }
        return idx; // new length
    }

    public static void main(String[] args) {
    	RemoveElement o = new RemoveElement();

        int[] nums = {3, 2, 2, 3, 4, 2};
        int val = 2;

        int newLength = o.removeElement(nums, val);

        System.out.println("New length: " + newLength);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
