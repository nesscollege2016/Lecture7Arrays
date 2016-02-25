package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int sum = 0;
        int[] grades = new int[s.nextInt()];
        int min = 100;
        int max = 0;

        //now we fill the grades array
        for (int i = 0; i < grades.length; i++) {

            System.out.println("Enter the grade:");
            grades[i] = s.nextInt();
            sum += grades[i];
            min = grades[i] < min ? grades[i] : min;
            max = grades[i] > max ? grades[i] : max;
        }

        System.out.println("The avg is " + sum / grades.length);
        System.out.println("the min is " + min);
        System.out.println("the max is " + max);
    }
}
