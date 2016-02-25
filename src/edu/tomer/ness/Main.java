package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //1) declare an array with a size:
        int[]  numbers = new int[3];

        // setting all the values in the array:
        for (int i = 0; i < numbers.length; i++) {
            // setting values in the array:
            System.out.println("Enter the "+ i +" number");
            numbers[i] = s.nextInt();
        }

        // reading all the values from the array:
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("the value of nums["+i+"] = " +numbers[i]);
        }
    }
}
