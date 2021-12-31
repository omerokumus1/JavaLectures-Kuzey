package Ch6_Methods;

import java.util.Scanner;

public class BMIbyMethods {
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

        double weight = readWeight();
        double height = readHeight();
        double bmi = calculateBMI(weight, height);
        printResult(bmi);
    }

    public static void printResult(double bmi){
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
        }
    }

    public static double calculateBMI(double weight, double height){
        double bmi = weight / (height*height);
        return bmi;
    }

    public static double readWeight(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight: ");
        String weight = input.nextLine();
        return Double.parseDouble(weight);
    }

    public static double readHeight(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        String height = input.nextLine();
        return Double.parseDouble(height);
    }

}
