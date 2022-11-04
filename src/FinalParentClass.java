import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FinalParentClass {
    private static String name = "Ate";
    private String lastName = "Haile";
    private static int num = 10;

    public FinalParentClass(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    static {
        System.out.println("super static block");
    }
    {
        System.out.println("super instance block");
    }

    public FinalParentClass() {
        System.out.println("super constructor called");
    }
    public FinalParentClass(String a) {
        this.lastName = a;
        System.out.println("super constructor called");
    }

    public static void testMethod(){
        System.out.println("parent testMethod method");
        System.out.println(num);
    }

}
class Child extends FinalParentClass {
    public Child() {
        System.out.println("child constructor called");
    }
    private static int num = 20;
    static {
        System.out.println("child static block");
    }
    {
        System.out.println("child instance block");
    }
    public static void testMethod(){
        System.out.println("child testMethod mehtod");
        System.out.println(num);
    }

}
class Main{
    public final static void main(String[] args) {
        FinalParentClass f = new Child();
        f.testMethod();
        FinalParentClass f1 = new FinalParentClass();
        f.testMethod();
    }
}
