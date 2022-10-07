import java.util.ArrayList;
import java.util.Map;

public class FinalParentClass {
    private String name;
    private String lastName;

    public FinalParentClass(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public void test(){
        System.out.println("parent class");
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

}
class Child extends FinalParentClass {
    private int number;
    public Child(int nub, String name, String lastName) {
        super(name, lastName);
        this.number = nub;
    }

    public void test(){
        System.out.println("child class");
    }

}
class Main{
    public final static void main(String[] args) {
        FinalParentClass f = new Child(123, "a", "b");
        f.test();
    }
}
