package array;

public class Find_Pivot_Index {

	public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        solution sol = new solution();
        int result = sol.pivotIndex(nums);
        if (result != -1) {
            System.out.println("Pivot Index: " + result);
        } else {
            System.out.println("No Pivot Index found");
        }

	}

}
class solution {
    public int pivotIndex(int[] nums) {
        int[] p=new int[nums.length];
        p[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        for(int i=0;i<p.length;i++){
            if(i==0){
                if(p[nums.length-1]-p[0]==0){
                    return 0;
                }
            }
            else{
                if(p[i-1]==p[p.length-1]-p[i]){
                return i;
            }
            }
  

        }
        return -1;
    }
}