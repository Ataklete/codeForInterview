import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Exercise2 extends ArrayList {

    @Override
    public boolean add(Object o) {
        if (this.contains(o))
            return true;
        else
            return super.add(o);
    }

    public static void printStar(int n) {

        if (n <= 1) {
            System.out.print("*");
        } else {
            printStar(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
        }

        System.out.print("\n");
    }

    public static void main(String[] args) {
        Exercise2 a = new Exercise2();

        a.add("henok");
        a.add("helen");
        a.add("henok");

        System.out.println("custom arrayList implement add method with no depulicated" + a);

        String name = "ati";
        String secondName = "ati";
        String thirdName = new String("ati");
        String fourthName = new String("ati");
        A aa = new A("ati");
        B bb = new B("ati");
        B cc = new B("ati");

        System.out.println(name.equals(secondName));
        System.out.println(aa.equals(bb));
        System.out.println(bb.equals(cc));


        printStar(5);

        int myArray[] = {0, 1, 2};//new int[5];
        System.out.println(myArray[0]);

        Map m = new HashMap();
        m.put(null, "Test");
        m.put(null, "Fest");
        System.out.println(m);

        int myarrays[][] = new int[2][3];
        myarrays[1][0] = 11; //{11,11,11};
        System.out.println(myarrays[1][0]);

        boolean[] be = new boolean[3];
        for (boolean c : be)
            System.out.println(c);

        Float f = new Float(12);
        switch ("10") {
            case "12":
                System.out.println("Twelve");
            case "0":
                System.out.println("Zero");
            default:
                System.out.println("Default");
        }
        int x = (int) Math.ceil(Double.valueOf("10.2").doubleValue());
        System.out.println("x is " + x);

        String s = new String("atiabianiti");
        System.out.println("---" + s.replace("a", "H"));
        System.out.println("string replace by H " + s.replaceFirst("a", "b"));
        System.out.println("substring " + s.subSequence(5, 9));
        StringBuffer buffer = new StringBuffer("ati");
        buffer.append("Haile").replace(1, 5, "xxx");
        System.out.println("buffer " + buffer);

        StringBuilder builder = new StringBuilder("ati");
        builder.append("Haile").replace(1, 5, "xxx");
        System.out.println("builder " + builder);

//
//        B b = new B();
//        System.out.println("x = " + b.GetResult( 0, 1));
    }
}
