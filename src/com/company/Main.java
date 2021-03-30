package com.company;

import java.util.Scanner;

public class Main {

    public static int checkNumber(int input) {
        int numPalindromes = 0;

        for (int i = 2; i < 11; i++) {
            int result = 0;
            int remainder = 0;
            int numToCheck = input;
            double x = 0;
            while(numToCheck>0){
                remainder = numToCheck % i;
                remainder = (int) (remainder * Math.pow(10.0,x));
                result = result + remainder;
                numToCheck = numToCheck/i;
                x++;
            }
            System.out.println(result);
            boolean isPallindrome = checkPalindrome(result);
            if(isPallindrome){
                numPalindromes++;
            }
        }
        return numPalindromes;
    }

    public static boolean checkPalindrome(int result) {
        boolean isPallindrome = true;
        //method to count the number of digits in the number
        int counter = 0;
        int checker = result;
        while(checker>0){
            checker = checker / 10;
            counter++;
        }
        //create an array to store the digits
        int[] newArray = new int[counter];
        //place each individual digit into the array
        for(int i = 0; i<counter; i++){
            newArray[i]=result%10;
            result = result/10;
        }

        int length = counter;
        counter = counter -1;

        for(int j = 0; j<(newArray.length/2); j++){
            System.out.println(newArray[j]+" "+newArray[counter]);
            if(newArray[j] != newArray[counter]){
                isPallindrome = false;
            }
            counter = counter -1;
        }
        return isPallindrome;
    }

    public static void main(String[] args) {

        int numPalindromes = 0;
        int numToCheck = 0;

        Scanner sc = new Scanner(System.in);
        numToCheck = sc.nextInt();
        numPalindromes = checkNumber(numToCheck);
        System.out.println("Number of Pallindromes " + numPalindromes);
    }
}