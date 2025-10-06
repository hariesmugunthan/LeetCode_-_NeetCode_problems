class Solution {
    public int findMiddleIndex(int[] nums) {
        int[] p = new int[nums.length];
        p[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            p[i] = p[i - 1] + nums[i];
        }
        int total = p[p.length - 1];
        for (int i = 0; i < p.length; i++) {
            if (i == 0) {
                if (total - p[i] == 0)
                    return i;
            } else if (i == p.length - 1) {
                if (p[i - 1] == 0)
                    return i;
            } else {
                if (p[i - 1] == total - p[i])
                    return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 3, -1, 8, 4};
        System.out.println(sol.findMiddleIndex(nums));
    }
}
