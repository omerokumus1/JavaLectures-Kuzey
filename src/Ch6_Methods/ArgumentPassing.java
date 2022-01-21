package Ch6_Methods;

import java.util.Arrays;

public class ArgumentPassing {
    public static void main(String[] args) {
        // pass-by-value: arguments are copied into parameters. primitive type values are passed-by-value
        int x = 5;
        System.out.println("x in main before function: " + x);
        incrementByOne(x);
        System.out.println("x in main after function: " + x);

        // pass-by-reference: arguments are passed into parameters (no copy!). objects are passed-by-reference
        int[] arr = {1, 2, 3};
        System.out.println("arr in main before function: " + Arrays.toString(arr));
        alterArray(arr);
        System.out.println("arr in main after function: " + Arrays.toString(arr));

    }

    public static void alterArray(int[] arr) {
        arr[0] = 111;
        System.out.println("arr in function: " + Arrays.toString(arr));
    }

    /*
        main:                   incrementByOne
        x    ----copy----->     x
     */
    public static void incrementByOne(int x) {
        x++;
        System.out.println("x in function: " + x);
    }

//    public static void problem(){
//        double m = findSlope();
//        String lineEquation = getLineEquation();
//    }

}
