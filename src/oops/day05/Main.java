package oops.day05;

public class Main {

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int count = 1;

            while (linearSearch(nums, current + 1)) {
                current++;
                count++;
            }

            longest = Math.max(longest, count);
        }

        System.out.println("Longest Consecutive Sequence Length = " + longest);
    }

    public static boolean linearSearch(int[] nums, int target) {

        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }
}