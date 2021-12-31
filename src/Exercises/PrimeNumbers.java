package Exercises;

public class PrimeNumbers {
    public static void main(String[] args) {
        // Find prime numbers up to "limit"
        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
        // sayıyı al -> kontrol et-> kontrol sonucuna göre işlem yap -> başa sar
        /*
            1. sayıyı al
            2. kontrol et
            3. kontrol sonucuna göre işlem yap
            4. 1'e git
         */
        /** TODO:
         *      1. Take number
         *      2. Check number if it is prime
         *          2.1. If it is prime keep it, else skip it
         *      3. go to 1.
         *
         */

        int limit = 100;
        String primeNumbers = "";
        for (int number = 2; number < limit; number++) {
            if (isPrime(number))
                primeNumbers = keepNumber(primeNumbers, number);
        }
        System.out.println(primeNumbers);
    }
    public static String keepNumber(String primeNumbers, int number){
        return primeNumbers + " " + number;
    }

    public static boolean doesDivide(int number, int divider) {
        return number % divider == 0;
    }
    public static boolean isPrime(int number){
        for (int divider = 2; divider < number; divider++) {
            if (doesDivide(number, divider))
                return false;
        }
        return true;
    }


}
