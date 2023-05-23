package study.MedianTwoSortedArrays;

import java.util.Arrays;

public class Median1 {
	

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] combineArray = new int[nums1.length + nums2.length];
		System.arraycopy(nums1, 0, combineArray, 0, nums1.length);
		System.arraycopy(nums2, 0, combineArray, nums1.length, nums2.length);
		Arrays.sort(combineArray);
		int targetNumber = combineArray.length / 2;
		
		if (combineArray.length % 2 == 0) {
			return ((double)combineArray[targetNumber-1] + combineArray[targetNumber]) /2;
		}else {
			return (double)combineArray[targetNumber];
		}
		
    }
}
