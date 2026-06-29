package Cognizant_Problems;

class MaxSubarray {

    public int maxVowels(String s, int k) {

        int count = 0;

        // first window
        for(int i = 0; i < k; i++) {
            if(isVowel(s.charAt(i))) {
                count++;
            }
        }

        int max = count;


        // sliding window
        for(int i = k; i < s.length(); i++) {

            // add new character
            if(isVowel(s.charAt(i))) {
                count++;
            }

            // remove old character
            if(isVowel(s.charAt(i-k))) {
                count--;
            }

            max = Math.max(max, count);
        }

        return max;
    }


    public boolean isVowel(char ch) {

        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }


    public static void main(String[] args) {

        MaxSubarray obj = new MaxSubarray();

        String s = "abciiidef";
        int k = 3;

        int result = obj.maxVowels(s, k);

        System.out.println("Maximum vowels = " + result);
    }
}