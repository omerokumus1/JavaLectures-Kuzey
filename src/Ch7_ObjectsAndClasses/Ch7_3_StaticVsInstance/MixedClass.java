package Ch7_ObjectsAndClasses.Ch7_3_StaticVsInstance;

public class MixedClass {
    static String staticName = "static name";
    String instanceName = "instance name";

    // instance methoddan instance veya static method'a değişkene erişilebilir
    // static methoddan sadece static methoda veya değişkene erişilebilir instance'ye erişilemez
    public static void staticMethod() {
        System.out.println("static method in mixed class");
//        System.out.println(instanceName);
//        instanceMethod();
    }

    public void instanceMethod() {
        System.out.println("instance method in mixed class");
        staticMethod();
        System.out.println(staticName);
    }


}
