public class Mathematics {
    public static void main(String[] args) {
        int x = 5, y = 7;
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int dif = Math.abs(x - y);

        // Random
        double rand = Math.random();
        System.out.println(rand);
        double r = Math.random() * 10; // 0 <= r < 1 -> 0 <= 10r < 10, 0 <= 100r < 100
        int rInt = (int) Math.floor(r);
        System.out.println("0 <= r < 1");
        System.out.println("r: " + r);
        System.out.println("rInt: " + rInt);

        r = Math.random() * 100;
        rInt = (int) r;
        System.out.println("0 <= r < 100");
        System.out.println("r: " + r);
        System.out.println("rInt: " + rInt);

        // 24 <= r < 36
        // 36-24 = 12, 0 <= r < 1 (x12)-> 0 <= 12r < 12 (+24)-> 24 <= 12r < 36
        r = Math.random() * 12;  // 0 <= r < 12
        rInt = (int) (r+24); // 24 <= r < 36
        System.out.println("24 <= r < 36");
        System.out.println("r: " + r);
        System.out.println("rInt: " + rInt);

        // Single line for integer random generation
        r = (int) (Math.random() * 12 + 24);

        // -17 <= r <= 21
    }
}
