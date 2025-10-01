package prefixsum;

public class Find_the_Highest_Altitude {

	public static void main(String[] args) {
		 Solution sol = new Solution();

	        int[] gain = {-5, 1, 5, 0, -7};  
	        int result = sol.largestAltitude(gain);

	        System.out.println("The highest altitude is: " + result);

	}

}
class Solution {
    public int largestAltitude(int[] gain) {
        int[] p=new int[gain.length+1];
        p[0]=gain[0];
        p[gain.length]=0;
        for(int i=1;i<p.length-1;i++){
            p[i]=p[i-1]+gain[i];
        }
        int max=0;
        for(int i=0;i<p.length;i++){
            if(max<p[i]){
                max=p[i];
            }
           

        
    }
    return max;
}
}