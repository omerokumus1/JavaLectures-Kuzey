package Ch7_ObjectsAndClasses.Ch7_2_DefiningClasses;

public class Test {
    public static void main(String[] args) {
        Keyboard keyboard1 = new Keyboard();
        Keyboard keyboard2 = new Keyboard("Logitech", "Mx Keys", "Gray", 2000);

        System.out.println(keyboard2.brand);
        System.out.println(keyboard2.model);
        System.out.println(keyboard2.color);
        System.out.println(keyboard2.price);

        Math.pow(2, 3);
        keyboard2.discount(200);
        System.out.println(keyboard2.price);

        keyboard2.discount(0.1);
        System.out.println(keyboard2.price);

        keyboard2.price = 2500;
        System.out.println(keyboard2.price);
    }
}
