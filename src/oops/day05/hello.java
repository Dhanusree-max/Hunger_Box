package oops.day05;

import java.util.Arrays;

public class hello {

    public static void setZeroes(int[] nums) {

        int i=0;
        for(int j= nums.length-1;j>=0;j--){
            if(nums[j]==0){
                int temp=nums[nums.length-j];
                nums[nums.length-j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={4,5,0,1,9,0,5,0};
        setZeroes(nums);
        System.out.println(Arrays.toString(nums));


    }
}