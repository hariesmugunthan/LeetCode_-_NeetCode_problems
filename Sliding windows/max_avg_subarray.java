class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double wmx = 0;

        for (int i = 0; i < k; i++) {
            wmx = wmx + nums[i];
        }
        double mx = wmx;
        for (int i = k; i < nums.length; i++) {
            wmx += nums[i] - nums[i - k];
            mx = Math.max(mx, wmx);
        }
        return mx / k;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = sol.findMaxAverage(nums, k);
        System.out.println("Maximum Average: " + result);
    }
}
