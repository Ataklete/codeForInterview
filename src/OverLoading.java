import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class  OverLoading{

        int add(int a, int b) {
            return (a+b);
        }

        public static void main (String args[]) {
            System.out.println(" using OverLoading class");
            OverLoading a = new OverLoading();
            System.out.println("OverLoading is :" + a.add(5,10));
        }

        public static void main (int i) {
            System.out.println(" Using OverLoading class main function with integer argument");
            OverLoading a = new OverLoading();
            System.out.println("OverLoading is :" + a.add(20, 10));
        }
    }

    class DefClass {

        public static void main (String args[]) {
            System.out.println(" using DefClass");
            OverLoading a = new OverLoading();
            System.out.println("OverLoading is :" + a.add(5, 10));
            OverLoading.main(null);
            OverLoading.main(1);
        }
    }

