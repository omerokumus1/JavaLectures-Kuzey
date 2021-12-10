package Exercises;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        /*
        Exercises.BMI < 18.5 Underweight
        18.5 ≤ Exercises.BMI < 25.0 Normal
        25.0 ≤ Exercises.BMI < 30.0 Overweight
        30.0 ≤ Exercises.BMI Obese
        bmi = weight / (height*height)
         */
        /* TODO:
                1. Take input from the user
                2. Calculate bmi
                3. Print the result according to the bmi
         */

        // 1. Take input from the user
        Scanner input = new Scanner(System.in);
        // prompt the user
        System.out.println("Enter height in m as integer: ");
        double height = input.nextDouble(); // in m
        System.out.println("Enter weight in kg as double: ");
        double weight = input.nextDouble(); // in kg

        // 2. Calculate bmi
        double bmi = weight / (height*height);

        // 3. print the result according to the bmi
        if (bmi < 18.5){
            System.out.println("Underweight");
        }
        else if(bmi < 25 ){
            System.out.println("Normal");
        }
        else if (25 <= bmi && bmi < 30){
            System.out.println("Overweight");
        }
        else{
            System.out.println("Obese");
        } // clean code over clever code

    }
}
