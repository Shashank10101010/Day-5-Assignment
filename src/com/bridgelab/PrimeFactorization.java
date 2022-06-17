package com.bridgelab;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {
        System.out.print(" Enter a number : ");

        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        int i = 2;
        while (i <= number) {

            if (number % i == 0) {
                System.out.print(i + "*");
                number /= i;
                continue;
            }
            i++;
        }
    }
}
