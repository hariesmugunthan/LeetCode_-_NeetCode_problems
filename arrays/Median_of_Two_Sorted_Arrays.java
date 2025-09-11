package array;
import java.util.*;

public class Median_of_Two_Sorted_Arrays {

	public static void main(String[] args) {
		Median_of_Two_Sorted_Arrays o1 = new Median_of_Two_Sorted_Arrays();

	        int[] nums1 = {1, 3};
	        int[] nums2 = {2};
	        System.out.println("Median: " + o1.findMedianSortedArrays(nums1, nums2));

	        int[] nums3 = {1, 2};
	        int[] nums4 = {3, 4};
	        System.out.println("Median: " + o1.findMedianSortedArrays(nums3, nums4));

	        int[] nums5 = {0, 0};
	        int[] nums6 = {0, 0};
	        System.out.println("Median: " + o1.findMedianSortedArrays(nums5, nums6));

	}
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int l=nums1.length+nums2.length;
	        int[] a=new int[l];

	        int mid,idx=0;
	        for(int i=0;i<nums1.length;i++){
	            a[idx++]=nums1[i];
	        }
	        for(int i=0;i<nums2.length;i++){
	            a[idx++]=nums2[i];
	        }
	        Arrays.sort(a);
	        if(l%2==0){
	            mid=a.length/2;
	            double ans=(double)a[mid]+(double)a[mid-1];
	            return ans/2;

	        }
	        else{
	            mid=a.length/2;
	            return (double) a[mid];
	        }
	        
	    }

}
