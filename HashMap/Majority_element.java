import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                int count = hm.get(nums[i]);
                hm.put(nums[i], count + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        int v = Integer.MIN_VALUE;
        int k = 0;
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (v < e.getValue()) {
                v = e.getValue();
                k = e.getKey();
            }
        }
        return k;
    }

  
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};

        System.out.println("Majority Element in nums1: " + obj.majorityElement(nums1));
        System.out.println("Majority Element in nums2: " + obj.majorityElement(nums2));
    }
}
