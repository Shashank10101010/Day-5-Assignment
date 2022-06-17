package com.bridgelab;

public class SwappingTwoNumbers {
        static void Swap( int m, int n) {
            int temp = m;
            m = n;
            n = temp;
        }
        public static void main (String[] args){
            int m = 9, n = 5;
            Swap(m, n);
            System.out.println("The value of m is " + m + " and the value of n is " + n);
        }
}

