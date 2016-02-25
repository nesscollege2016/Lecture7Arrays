package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int size = s.nextInt();
        
        int[] grades = new int[size];
        //now we fill the grades array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the grade:");
            grades[i] = s.nextInt();;
        }


        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + grades[i];
        }

        double avg = sum / size;
        System.out.println("The avg is " + avg);

        //calculate the min grade;

        int min = grades[0];
        for (int i = 0; i < size; i++) {
            int grade = grades[i];
            if (grade < min)
                min = grade;
        }
        System.out.println("the min is " + min);

        int max = grades[0];
        for (int i = 0; i < size; i++) {
            int grade = grades[i];
            if (grade > max)
                max = grade;
        }
        System.out.println("the max is " + max);
    }
}
