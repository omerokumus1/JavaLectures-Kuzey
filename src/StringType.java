public class StringType {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("Length: " + str.length());
        System.out.println("character at 0. index: " + str.charAt(0));
        System.out.println("character at 1. index: " + str.charAt(1));
        System.out.println("Java concatenated with programming: " + str.concat(" programming"));
        System.out.println("To uppercase: " + str.toUpperCase());
        System.out.println("to lowercase: " + str.toLowerCase());

        // Static method: ClassName.methodName(parameters): Ex; Character.isLetter('x'), Math.random()
        // instance method: variableName.methodName(parameters): str.toUppercase(), str.charAt(0)

        int x = 3;
        int y = 9;
        System.out.println("x + y = " + x + y );
        System.out.println("x + y = " + (x + y) );

        // static vs instance method
        // nextLine ile input alma (Integer.parseInt)
    }
}
