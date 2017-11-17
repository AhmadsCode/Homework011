/*
 * @author Ahmad Wahedi
 * CSC 201-004N
 * Assignment 11
 * Problem 11.4
(Maximum element in ArrayList) Write the following method that returns the maximum value in an
 ArrayList of integers. The method returns null if the list is null or the list size is 0.
*/

import java.util.Scanner;
        import java.util.ArrayList;

public class homework11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);     // Creates a Scanner

        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();            // Creates an ArrayList

        // Prompts user to enter numbers ending with 0
        System.out.print("Enter numbers ending with zero: ");
        Integer num = input.nextInt();
        while (num.intValue() != 0) {
            list.add(num);
            num = input.nextInt();
        }

        System.out.println("The largest number in the input is " + max(list)); //Displays largest number
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list.size() == 0)
            return null;

        Integer max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max)
                max = list.get(i);
        }
        return max;
    }
}