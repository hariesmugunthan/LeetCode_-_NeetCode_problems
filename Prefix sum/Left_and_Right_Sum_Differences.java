class Solution {
    public int[] leftRightDifference(int[] nums) {
        int s = nums.length;
        int[] l = new int[s];
        int[] r = new int[s];
        for (int i = 1; i < s; i++) {
            l[i] = l[i - 1] + nums[i - 1];
        }
        for (int i = s - 2; i >= 0; i--) {
            r[i] = r[i + 1] + nums[i + 1];
        }
        for (int i = 0; i < s; i++) {
            int e = l[i] - r[i];
            if (e < 0) {
                e = e * -1;
            }
            nums[i] = e;
        }
        return nums;
    }

   
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] nums = {10, 4, 8, 3};
        int[] result = obj.leftRightDifference(nums);

        System.out.print("Result: ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
