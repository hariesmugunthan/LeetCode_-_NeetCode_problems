package prefixsum;

public class Minimum_Value_to_Get_Positive_Step_by_Step_Sum {

	public static void main(String[] args) {
		int[] nums = {-3, 2, -3, 4, 2};
		Solution1 sol = new Solution1();
		int result = sol.minStartValue(nums);
		System.out.println("Minimum start value: " + result);


	}

}
class Solution1 {
    public int minStartValue(int[] nums) {
        int[] p=new int[nums.length];
        int h=0;
        p[0]=nums[0];
        for(int i=1;i<p.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        for(int i=0;i<p.length;i++){
           h=Math.min(h,p[i]);

        }
      //  System.out.print(h);
        return (h*-1)+1;

        
    }
}
