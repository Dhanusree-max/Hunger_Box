package collections;

class Solution {
    public int majorityElement(int[] nums) {
        int cand = 0;
        int count = 0;

        for (int arr : nums) {
            if (count == 0) {
                cand = arr;
            }

            if (cand == arr) {
                count++;
            }
            else {
                count--;
            }
        }

        return cand;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};

        int result = obj.majorityElement(nums);

        System.out.println("Majority Element: " + result);
    }
}