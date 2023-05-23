package study.kthLargestElement_215;

import java.util.Arrays;

public class Solution1 {
	
	
	
	 public  int findKthLargest(int[] nums, int k) {
		 
		 Arrays.sort(nums);
	     System.out.println(Arrays.toString(nums));
		 
		 return nums[nums.length - k];
	 }
}
