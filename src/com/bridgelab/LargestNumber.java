package com.bridgelab;

import java.util.Scanner;

public class LargestNumber {
    static int number1, number2, number3;

    public static void main(String[] args) {
        System.out.println("Enter first number ");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.println("Enter second number ");
        Scanner s = new Scanner(System.in);
        number2 = s.nextInt();
        System.out.println("Enter third number ");
        Scanner sca = new Scanner(System.in);
        number3 = sca.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Number1 is the largest ");
        } else if (number3 > number1 && number3 > number2) {
            System.out.println("Number3 is the largest ");
        } else {
            System.out.println("Number2 is the largest ");
        }
    }
}
