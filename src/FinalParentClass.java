import java.util.ArrayList;
import java.util.Map;

public class FinalParentClass {
    private String name = "Ate";
    private String lastName = "Haile";
    private static int num = 10;

    static {
        System.out.println("super static block");
    }
    {
        System.out.println("super instance block");
    }

    public FinalParentClass() {
        System.out.println("super constructor called");
    }

    public void test(){
        System.out.println("parent test method");
        System.out.println(num);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
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

    public void test(){
        System.out.println("child test mehtod");
        System.out.println(num);
    }

}
class Main{
    public final static void main(String[] args) {
        FinalParentClass f = new Child();
        f.test();
        FinalParentClass f1 = new FinalParentClass();
        f.test();
    }
}
