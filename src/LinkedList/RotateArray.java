package LinkedList;
import java.util.*;

public class RotateArray {
        public void rotateArray(int[] nums, int k) {
            for (int i = 0; i < k; i++) {
                int key = nums[0];

                for (int j = 1; j < nums.length; j++) {
                    nums[j - 1] = nums[j];
                }

                nums[nums.length - 1] = key;
            }
        }

        public static void main(String[] args) {
            RotateArray obj = new RotateArray();

            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;

            obj.rotateArray(nums, k);

            System.out.println(Arrays.toString(nums));
        }
    }

