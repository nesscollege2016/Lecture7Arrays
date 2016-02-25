package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int size = s.nextInt();
        int sum = 0;
        int[] grades = new int[size];
        int min = grades[0];
        int max = grades[0];

        //now we fill the grades array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the grade:");
            grades[i] = s.nextInt();
            sum = sum + grades[i];

            int grade = grades[i];
            if (grade < min)
                min = grade;

            if (grade > max)
                max = grade;
        }

        double avg = sum / size;
        System.out.println("The avg is " + avg);
        System.out.println("the min is " + min);
        System.out.println("the max is " + max);
    }
}
