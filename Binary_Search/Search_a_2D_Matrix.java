class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int row=nums.length;
        int col=nums[0].length;
        int l=0,r=row*col-1;
        int mid;
        
        while(l<=r){
            mid=l+(r-l)/2;
            int a=mid/col;
            int b=mid%col;
            if(nums[a][b]==target){
                return true;
            }
            else if(nums[a][b]>target){
                r=mid-1;
            }
            else
            l=mid+1;
        }
       
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] nums = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 16;
        System.out.println(s.searchMatrix(nums, target));
    }
}
