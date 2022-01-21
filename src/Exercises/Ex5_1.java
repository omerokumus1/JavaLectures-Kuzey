package Exercises;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        /*
        (Count positive and negative numbers and compute the average of numbers) Write
        a program that reads an unspecified number of integers, determines how many
        positive and negative values have been read, and computes the total and average of
        the input values (not counting zeros). Your program ends with the input 0. Display
        the average as a floating-point number
         */

        /** TODO:
         *      1. Read numbers from console. If the input is 0, break reading
         *      2. Count positive and negative numbers
         *      3. Compute total and average of numbers excluding zero
         *      4. Display result
         */

//        1. Read numbers from console. If the input is 0, break reading
        Scanner input = new Scanner(System.in);
        // 2 4 1 5 9 -5 -11 4 -35 0
        System.out.print("Enter number sequence: ");
        int number, positives = 0, negatives = 0, sum = 0;
        while (true){
            number = input.nextInt();
            if (number == 0) // If the input is 0, break reading
                break;
            // 2. Count positive and negative numbers
            if (number > 0)
                positives++;
            else if (number < 0)
                negatives++;

            sum += number;
        }
        int totalNumber = positives + negatives;
        double avg = ((double) sum) / totalNumber;

        System.out.println("sum: " + sum);
        System.out.printf("avg: %.2f", avg);



    }
}
