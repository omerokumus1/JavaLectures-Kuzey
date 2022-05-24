package Ch7_ObjectsAndClasses.Ch7_3_StaticVsInstance;

public class Test {
    public static void main(String[] args) {
//        StaticClass sc = new StaticClass(); // buna gerek yok çünkü objeye ihtiyacımız yok

        System.out.println(StaticClass.name);
        StaticClass.staticMethod();

        InstanceClass ic = new InstanceClass(); // buna gerek var çünkü instance class
        System.out.println(ic.name);
        ic.instanceMethod();


    }
}
