package edu.tomer.ness;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //how many numbers? array size;
        System.out.println("Enter the class size:");
        int n = s.nextInt();

        //define the arrays:
        String[] names = new String[n];
        String[] phones = new String[n];

        //fill the arrays:
        for (int i = 0; i < n; i++) {
            System.out.println("enter the name of " + (i + 1));
            names[i] = s.next();
            System.out.println("Enter the phone for " + names[i]);
            phones[i] = s.next();
        }

        //print the array:
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " " + phones[i]);
        }
    }
}
