package oops.day05;
import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        List<Integer> result = new ArrayList<>();

        int n = nums.length;

        // Count frequency
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        // Find elements with frequency > n/3
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > n / 3) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
    // Main method
    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {1, 2, 1, 1, 3, 2};

        List<Integer> ans = obj.majorityElement(nums);

        System.out.println(ans);
    }
}