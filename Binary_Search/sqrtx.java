class Solution {
    public int mySqrt(int x) {
        long mid=x/2;
        long l=0,r=mid;
        long ans=0;
        if(x==1) return 1;
        while(l<=r){
            if((mid*mid)==x) return(int)mid;
            else if((mid*mid)>x) {r=mid-1;}
            else if((mid*mid)<x) {l=mid+1;ans=mid;}//mula saaman aa use pannu da baadu
            mid=(l+r)/2;

        }
        return (int)ans;
        
    }
}
