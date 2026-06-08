package oops.day05;

import java.util.*;

public class hello {

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            max = Math.max(sum, max);

            if (sum < 0) {
                sum = 0; // Reset negative sum
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] nums1 = {2,-5,1,7,-3,4,-6};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums1));
    }
}