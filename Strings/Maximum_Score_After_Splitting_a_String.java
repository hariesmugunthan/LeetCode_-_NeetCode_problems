package string;

public class Maximum_Score_After_Splitting_a_String {

	public static void main(String[] args) {
		String s = "011101";
		Solution sol = new Solution();
		int result = sol.maxScore(s);
		System.out.println("Maximum Score: " + result);


	}

}
class Solution {
    public int maxScore(String s) {
        int maxi=0;
        
        for(int i=0;i<s.length()-1;i++){
            int l=0;
            int r=0;
            //for l
            for(int j=0;j<=i;j++){
                if(s.charAt(j)=='0'){
                    l+=1;
                }
            }
            //for r;
            for(int k=i+1;k<s.length();k++){
                if(s.charAt(k)=='1'){
                    r+=1;
                }
            }
            maxi=Math.max(maxi,l+r);

        }
        return maxi;
        
    }
}