class Solution {
    public boolean searchMatrix(int[][] m, int t) {

        for(int i=0;i<m.length;i++){
            int l=0;
            int r=m[i].length-1;
            while(l<=r){
                int mid=(l+r)/2;
                if(m[i][mid]==t)return true;
                else if(m[i][mid]>t) r=mid-1;
                else l=mid+1;
            }

        }

        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] m = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int t = 16;
        System.out.println(s.searchMatrix(m, t));
    }
}
