import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) {
        // How to setup a loop
        // while loop
        int i = 1;
        while (i < 10) { // i: loop counter
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i += 2;

        }
        System.out.println();

        i = 1;
        while (i < 20) { // i < 20 -> loop-continuation condition
            if (i != 11 && i != 17) {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        int sum = 0;
        i = 1;
        while (i < 10) {
            sum += i;
            i++;
        }
        System.out.println("sum: " + sum);

//        Scanner input = new Scanner(System.in);
//        while (true){ // sentinel value
//            String str = input.nextLine();
//            if (str.equals("**9812")){
//                shutDown
//            }
//            else{
//                System.out.println("Menu: ");
//                System.out.println("1- Draw cash");
//                System.out.println("2- Deposit");
//                int choice = input.nextInt(); input.nextLine();
//                if (choice == 1){
//
//                }
//                else if (choice == 2){
//
//                }
//                else
//                    System.out.println("Wrong choice.");
//            }
//        }

        // do-while

        i = 0;
        sum = 0;
        do {
            sum += i;
            i += 2;
        } while (i <= 20);
        System.out.println("Sum: " + sum);

        // post/pre increment/decrement
        int x = 3;
        System.out.println("x before post increment: " + x);
        int a = x++;
        System.out.println("x after post increment: " + x);
        System.out.println("a after post increment: " + a);

        x = 3;
        System.out.println("x before pre increment: " + x);
        int b = ++x;
        System.out.println("x after pre increment: " + x);
        System.out.println("a after pre increment: " + b);


        // for loop
        for (int j = 0; j < 10; j++) {

        }

        for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        int initialValue = 1;
        int lastValue = initialValue + 10;
        for (int j = 0; j < 10; j++) {

            for (int k = initialValue; k < lastValue; k++) {
                System.out.print(k + " ");
            }

            System.out.println();

            initialValue += 10;
            lastValue = initialValue + 10;
        }

        // problematic double numbers
        double result = 0;
        for (double d = 0.01; d <= 1.0; d += 0.01) {
            result += d;
        }
        System.out.println("result: " + result);

        // continue
        // print numbers from 1 to 50 except for multiplications of 7
        for (int j = 1; j <= 50; j++) {
            if (j % 7 == 0) {
                continue;
            }
            System.out.print(j + " ");


        }
        System.out.println();
        System.out.println();

        // break
        // take 2 integers and display their multip.
        Scanner input = new Scanner(System.in);
        String str;
        int n1, n2;
        while (true) {
            System.out.println("Enter first integer. Enter q to quit");
            str = input.nextLine();
            if (str.equals("q")) { // sentinel-valued termination
                System.out.println("Good bye.");
                break;
            } else {
                n1 = Integer.parseInt(str);
                System.out.println("Enter second integer.");
                str = input.nextLine();
                n2 = Integer.parseInt(str);  //  Integer.parseInt(input.nextLine());
                System.out.println("result: " + (n1 * n2));
            }
        }

    }
}
