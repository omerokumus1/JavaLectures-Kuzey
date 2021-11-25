public class Selections {
    public static void main(String[] args) {
        boolean b = true; // or false
        int priceOfComp1 = 1200;
        // and = && , or = ||
        int x = 5;
        int y = -3;
        boolean result = x < 5 || y > 0;
        result = x < 6 && y < 0;
        if (priceOfComp1 < 1000) {
            System.out.println("buy computer 1");
        } else
            System.out.println("buy computer 2");

        if (priceOfComp1 < 1000)
            System.out.println("buy comp 1");
        else if (priceOfComp1 == 1000)
            System.out.println("wait");
        else
            System.out.println("buy comp 2");

        double cpuSpeed = 3.5;
        if (priceOfComp1 < 1000) {
            int c = 2;
            if (cpuSpeed < 4)
                System.out.println("pass");
            else
                System.out.println("buy");
        } // Context-free language (CFG)

        int c = 3;
        switch (c) {
            case 0:
                System.out.println("case 0");
                break;
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            default:
                System.out.println("case default");
        }


    }

}
