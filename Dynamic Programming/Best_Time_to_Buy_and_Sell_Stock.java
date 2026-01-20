class Solution {
    public int maxProfit(int[] pr) {
        int minp=Integer.MAX_VALUE;
        int maxp=0;
        for(int p:pr){
            minp=Math.min(minp,p);
            maxp=Math.max(maxp,p-minp);
        }
        return maxp;
    }
}
