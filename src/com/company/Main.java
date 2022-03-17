package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> evenNum = new ArrayList<>();
        ArrayList<Integer> oddNum = new ArrayList<>();
        Random random = new Random();
        int counter = 0;
        for (int i = 0; i < 50 ; i++) {
            counter = random.nextInt(1,100);
            if (counter % 2 == 0) {
                evenNum.add(counter);
            }
            if (counter % 2!= 0) {
                oddNum.add(counter);
            }
            System.out.print(counter + ", ");
        }
        System.out.println();
        System.out.println("EvenNum: " + evenNum);
        System.out.println("OddNum: " + oddNum);
    }
}
