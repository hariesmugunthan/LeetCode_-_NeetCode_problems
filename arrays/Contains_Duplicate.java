package Array;

class Contains_Duplicate {
	public boolean hasDuplicate(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    flag=1;
                    
                    
                }
            }
        }
        if(flag==0){
            return false;
        }
        else{
            return true;
        }
        
    }

	public static void main(String[] args) {
		 Contains_Duplicate obj = new Contains_Duplicate();

	        int[] nums1 = {77,55,4,6,3,32,77};  
	        int[] nums2 = {1, 2, 3, 34,354,65};  

	        System.out.println(obj.hasDuplicate(nums1)); 
	        System.out.println(obj.hasDuplicate(nums2));

	}

}
