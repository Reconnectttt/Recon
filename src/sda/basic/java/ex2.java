package sda.basic.java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    private final static float PI = 3.14f;


    public static void main(String[] args) {
        float diameter = GetDiameterFromUser();
        calculateArea(diameter);
        float area =calculateArea(diameter);
        System.out.println("Area of the Circle: " + area);
        float circumference = calculateCircumference(diameter);
        System.out.println("Circumference of the Circle: " + circumference);
    }

    private static float calculateCircumference(float diameter) {
        return PI * diameter;
    }

    private static float calculateArea(float diameter) {
        float radius = diameter / 2;
        return PI * (float)Math.pow(radius,2); //Math pow daje w double wiec rzutujemy na float
    }


    private static float GetDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert diameter: ");
        try {
            return scanner.nextFloat();
        } catch (InputMismatchException ex) {
            System.out.println("Wrong input");
            System.exit(1);
        }finally {
            {
                System.out.println("finally step");
        }
        return 0;
    }
    }



        }
