package com.bridgelab;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        Random random = new Random();

        int tail = 0, head = 0, i = 0;
        while (i < 20) {
            int check = random.nextInt(2);

            if (check == 0)
                tail++;
            else
                head++;
            i++;
        }
        System.out.println("Head " + head);
        System.out.println("Tail " + tail);

        float tailPercentage = ((float) tail / 20 * 100);
        float headPercentage = ((float) head / 20 * 100);

        System.out.println("Head percentage is " + headPercentage);
        System.out.println("Tail percentage is " + tailPercentage);
    }
}
