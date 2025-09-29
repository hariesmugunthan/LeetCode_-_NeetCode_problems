package array;

public class Range_Sum_Query {

	public static void main(String[] args) {
		 int[] nums = {-2, 0, 3, -5, 2, -1};

	       
	        NumArray numArray = new NumArray(nums);

	       
	        System.out.println(numArray.sumRange(0, 2));
	        System.out.println(numArray.sumRange(2, 5)); 
	        System.out.println(numArray.sumRange(0, 5)); 
		

	}

}
class NumArray {

    int[] p;
   public NumArray(int[] nums) {
       p=new int[nums.length];
       p[0]=nums[0];

       for(int i=1;i<nums.length;i++){
           p[i]=p[i-1]+nums[i];
       }
   }
   
   public int sumRange(int left, int right) {
       if(left==0){
           return p[right];
       }else{
           return p[right]-p[left-1];
       }
       
   }
}
