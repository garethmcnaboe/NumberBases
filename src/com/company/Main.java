package com.company;

import java.util.Scanner;

public class Main {

    public static int checkNumber(int input) {
        int numPalindromes = 0;

        for (int i = 2; i < 11; i++) {
            String result = "";
            int remainder = 0;
            int numToCheck = input;
            while(numToCheck>0){
                remainder = numToCheck % i;
                System.out.println(remainder);
                result = result + remainder;
                numToCheck = numToCheck/i;
            }
            String resultReversed = reverseString(result);
            boolean isPallindrome = checkPalindrome(resultReversed);
            if(isPallindrome){
                numPalindromes++;
            }
        }
        return numPalindromes;
    }
    //by-pass this method if timing issues arise
    public static String reverseString(String result){
        String resultReversed = "";

        for(int i = result.length()-1; i>-1; i--){
            resultReversed = resultReversed + result.charAt(i);
        }
        return resultReversed;
    }

    public static boolean checkPalindrome(String input) {
        int length = input.length();
        int a = 0;
        int z = length - 1;
        int m = length / 2;

        boolean pallindrome = true;

        while (pallindrome && (z > m)) {
            if (input.charAt(a) == input.charAt(z)) {
                a++;
                z--;
            } else {
                pallindrome = false;
            }
        }
        return pallindrome;
    }

    public static void main(String[] args) {

        int numPalindromes = 0;
        int numToCheck = 0;

        Scanner sc = new Scanner(System.in);
        numToCheck = sc.nextInt();
        numPalindromes = checkNumber(numToCheck);
        System.out.println(numPalindromes);
    }
}