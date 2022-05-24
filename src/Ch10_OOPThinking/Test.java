package Ch10_OOPThinking;

public class Test {
    public static void main(String[] args) {
        Ch10_2_Encapsulation o = new Ch10_2_Encapsulation();

        System.out.println(o.getName());
        o.setName("new Name");
        System.out.println(o.getName());

        Ch10_2_Encapsulation o2 = null;
        if (o2 != null)
            System.out.println(o2.getName());

//        o2.getName();
    }
}
