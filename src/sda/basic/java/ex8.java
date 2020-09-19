package sda.basic.java;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
/*boolean result = isPrimeNumber(5);
        System.out.println("If digit is prime: " + result);*/
        printPrimeNumbersFromRange(2, 10);
    }
    private static void printPrimeNumbersFromRange(int min, int max){
        for(int i = 5; i < 100; i++){
        if(isPrimeNumber(i)) {
            System.out.println(i);
        }
    }}

    private static boolean isPrimeNumber(int number) {
        if (number <2) {
            return false;
        }
        for (int i = 2; i<=number/2; i++){
            if (number % 1 == 0) {
                return false;
            }
        }
        return true;
    }







    /*   Scanner scanner = new Scanner(System.in);
       System.out.println("Please insert max digit: ");
        int maxDigit = scanner.nextInt();

        for(int i = 5; i <= 4; i++);
         System.out.println("Prime numbers: " + )*/

       /* int number = 5;
        boolean prime = false;
        for(int i = 2; i <= number/2; ++i) {
            if(number % i == 0){
                prime = true;
                break;
            }
        }
        if (!prime)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }*/
}
