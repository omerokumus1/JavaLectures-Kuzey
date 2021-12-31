package Ch6_Methods;


// HW1: Write GCD with methods
// HW2: Find perfect numbers up to 100k, use methods

public class MethodsIntro {
    public static void main(String[] args) {
        /** 1. Reusability increases
         *  2. Code maintainability increases
         *  3. Code modularization increases
         *  4. Codes are more debuggable
         *  5. Control over the code increases
         *  6. Abstraction is overly used
          */

        // function call/invocation
        addTwoIntegers(3, 5);
        greetings();
        int sum = addTwoIntegers2(5, 10);
        System.out.println("sum: " + sum);
        System.out.println("Program ends");
    }

    // function = method
    // void method: geriye bir şey döndürmeyen methoddur
    public static void addTwoIntegers(int n1, int n2){
        // function body, function block
        int sum = n1 + n2;
        System.out.println("sum: " + sum);
    }

    public static void greetings(){
        System.out.println("Hello everyone!");
    }

    // void olmayan method: geri bir şey dönen methodtur
    public static int addTwoIntegers2(int n1, int n2){
        // function body, function block
        int sum = n1 + n2;
        return sum;
    }
}
