package com.bridgelab;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}

