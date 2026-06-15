package oops.day05;

import java.util.*;

public class practicePurpose {

        public void nextPermutation(int[] nums) {
            int n = nums.length;
            int index = -1;

            for (int i = n - 2; i >= 0; i--) {
                if (nums[i] < nums[i + 1]) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                reverse(nums, 0, n - 1);
                return;
            }

            for (int i = n - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }

            reverse(nums, index + 1, n - 1);
        }

        public static void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }


        public static void main(String[] args) {

            int[] nums = {1,3,2};

            practicePurpose obj = new practicePurpose();

            obj.nextPermutation(nums);

            System.out.println("Next Permutation:");

            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    }
