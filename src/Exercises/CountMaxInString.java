package Exercises;

public class CountMaxInString {
    public static void main(String[] args) {
        /*
            You have a string consists of digits separated by a single space, count how many times the max number occurs
            Sample string
                "1 6 7 4 3 2 9 8 8 9 9 8 1 4 9"
         */
        /** TODO:
         *      1. Find max number
         *      2. Count occurences of max number
         *
         */
        String str = "1 6 7 4 3 2 9 8 8 9 9 8 1 4 9";
        // 1. Find max number
        int max = findMax(str);

        // 2. Count occurrences of max number
        int occurrencesOfMax =  countOccurrences(str, max);

        System.out.println(occurrencesOfMax);
    }

    private static int countOccurrences(String str, int max) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (getCharNumberAsInt(str.charAt(i)) == max)
                count++;
        }

        return count;
    }

    public static int findMax(String str) {
        int max = getCharNumberAsInt(str.charAt(0));
        int number;
        for (int i = 0; i < str.length(); i++) {
            if (isNotSpace(str.charAt(i))) {
                number = getCharNumberAsInt(str.charAt(i));
                if (number > max)
                    max = number;
            }
        }

        return max;
    }

    private static boolean isNotSpace(char ch) {
        return ch != ' ';
    }

    private static int getCharNumberAsInt(char ch) {
        return ch - 48;
    }
}
