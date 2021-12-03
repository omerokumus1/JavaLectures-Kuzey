import java.util.Scanner;

public class CharDataType {
    public static void main(String[] args) {
        char ch = 'A', ch2 = 'B', ch3 = 'x'; // A, B, x are character literals
        int x = 5; // 5 is an integer literal
        double y = 6.12; // 6.12 is a double literal
        String s = "java"; // "java" is a string literal

        // ASCII Code
        char c = 'A';
        int A = c; // implicit casting
        System.out.println(c);
        System.out.println(A);
        char B = 66;
        System.out.println(B);


        // Check if a character is uppercase, lowercase or a letter
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a character");
//        String s1 = input.nextLine();
//        char c1 = s1.charAt(0);
//        if (65 <= c1 && c1 <= 90)
//            System.out.println("Uppercase letter");
//        else if(97 <= c1 && c1 <= 122)
//            System.out.println("Lowercase letter");
//        else if(48 <= c1 && c1 <= 57)
//            System.out.println("A number");


        // Escape Sequences (Characters)
        // back slash
        System.out.println("Kobe Bryant says \"Be the best version of yourself\".");

        // New line: \n
        System.out.println("Thanos: I am inevitable.\nIron man: And I am Iron Man.");

        // tab
        System.out.println("Stock:\t5");
        System.out.println("Price:\t10$");

        // Back slash
        System.out.println("This is a backslash \\");

        // Methods from Character class
        System.out.println("is 5 a digit?: " + Character.isDigit('5'));
        System.out.println("is X a digit?: " + Character.isDigit('X'));
        System.out.println("X to lower: " + Character.toLowerCase('X'));
        Character.isLetter('a');
        Character.isLetterOrDigit(69);
        Character.isLowerCase('X');
        Character.isUpperCase(99);
        Character.toUpperCase('x');

        /**
         * HW: toUppercase, toLowercase, toggleCase programlarını yaz
         * 1- Kullanıdan input al
         * 2- Hatalı girişleri kontrol et. Hatalı girişler için hatalı giriş olduğunu söyle
         * 3- toUppercase, toLowercase ve toggleCase için 3 ayrı program yaz
         * 4- toggleCase: Büyük harf ise küçüğe, küçük harf ise büyüğe çevir
         */
    }
}
