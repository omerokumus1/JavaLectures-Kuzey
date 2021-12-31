package Exercises;

import java.util.Scanner;

public class Tournament {
    public static void main(String[] args) {
        System.out.print("Enter your win series as W or L separated by spaces");
        // W W L L W L -> 'W' 'W' 'L' 'L' 'W' 'L' -> 'W' 'W' 'W' -> 3
        int wCount = (int) (new Scanner(System.in)).nextLine().chars().filter(ch -> ch == 'W').count();
        if (wCount == 0) System.out.println("You are eliminated");
        else if (wCount == 1 || wCount == 2) System.out.println("Group 3");
        else if (wCount == 3 || wCount == 4) System.out.println("Group 2");
        else if (wCount == 5 || wCount == 6) System.out.println("Group 1");

        String input = "";
        for (int i = 0; i < 6; i++) input += (new Scanner(System.in)).nextLine();
        if ((int) input.chars().filter(ch -> ch == 'W').count() == 0) System.out.println("You are eliminated");
        else if ((int) input.chars().filter(ch -> ch == 'W').count() == 1 || (int) input.chars().filter(ch -> ch == 'W').count() == 2) System.out.println("Group 3");
        else if ((int) input.chars().filter(ch -> ch == 'W').count() == 3 || (int) input.chars().filter(ch -> ch == 'W').count() == 4) System.out.println("Group 2");
        else if ((int) input.chars().filter(ch -> ch == 'W').count() == 5 || (int) input.chars().filter(ch -> ch == 'W').count() == 6) System.out.println("Group 1");

    }
}
