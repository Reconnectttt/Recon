package sda.basic.java;

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz(i));
        }
    }
        private static String fizzBuzz(int number) {
            if (number % 15 ==0) {
                return "FizzBuzz";
            }else if (number % 3 ==0) {
                    return "Fizz";
                } else if (number % 5 ==0){
                    return "Buzz";
                }
            return String.valueOf(number);
                }
/*
    private static void numbers() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        for (int i = 1; i <= x;i++){
            if ()*/
        }



