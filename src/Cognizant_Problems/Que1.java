package Cognizant_Problems;
import java.util.*;
public class Que1 {

        public int maxArea(int[] height) {

            int left = 0;
            int right = height.length - 1;

            int maxWater = 0;

            while (left < right) {

                int width = right - left;

                int waterHeight = Math.min(height[left], height[right]);

                int area = width * waterHeight;

                maxWater = Math.max(maxWater, area);

                if (height[left] < height[right]) {
                    left++;
                }
                else {
                    right--;
                }
            }

            return maxWater;
        }


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter array size: ");
            int n = sc.nextInt();

            int[] height = new int[n];

            System.out.println("Enter heights:");

            for (int i = 0; i < n; i++) {
                height[i] = sc.nextInt();
            }


            Que1 obj = new Que1();

            int result = obj.maxArea(height);

            System.out.println("Maximum water area: " + result);

            sc.close();
        }
    }

