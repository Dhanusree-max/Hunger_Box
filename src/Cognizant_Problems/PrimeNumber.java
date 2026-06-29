package Cognizant_Problems;

import java.util.*;

class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();

        if(n<1||n>1000){
            System.out.println("This prime number is not valid");
            return;
        }
        for(int i=2;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }
            }
            if(isprime){
                System.out.print(i+" ");
            }
        }

    }
}