package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //get the array size from the user:
        System.out.println("How many numbers?");
        int size = s.nextInt();

        //define the array
        int[] numbers = new int[size];

        //fill the array:
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a number");
            numbers[i] = s.nextInt();
        }

        //iterate over the array and calc arr[i] += arr[i+1]
        for (int i = 0; i < size - 1; i++) {
            numbers[i] += numbers[i+1];
        }

        //print the array
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
