package sda.basic.java;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert first digit: ");
        int firstDigit = scanner.nextInt();
        System.out.println("Please insert second digit: ");
        int secondDigit = scanner.nextInt();

        boolean result;
        result = firstDigit > secondDigit ? true : false;
        System.out.println("If " + firstDigit + " is greater than " + secondDigit + " : " + result);
       result = firstDigit*3 > secondDigit ? true : false;
        System.out.println("If " + firstDigit + " is greater than " + secondDigit + " : " + result);
        result = (secondDigit++ < ++firstDigit) && (--firstDigit < secondDigit++) ? true : false;
        System.out.println("If " + firstDigit + " is smaller than " + secondDigit +" and "+ " : " + result);
        result = (firstDigit * secondDigit)%2 ==0;
        System.out.println("If " + firstDigit + " * " + secondDigit + " is even: " + result);




    }
}
