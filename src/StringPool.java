import java.util.Arrays;
import java.util.List;

public class StringPool {
    public static void main(String[] args) {

        System.out.println("m1 = " + m1());

        String s1 = "ati";
        String s2 = "ati";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        String s3 = new String("ati");
        String s4 = new String("ati");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

        System.out.println(s1==s3);
        System.out.println(s2.equals(s4));

        //----List.asList vs List.of---------
        // null suport vs not
        // update/add allowed vs not
        Integer[] array = {1,2,3};
        List<Integer> list = Arrays.asList(array);
        array[1] = 10;
        System.out.println(list); // Prints [1, 10, 3]

        Integer[] array1 = {1,2,3};
        List<Integer> list1 = List.of(array1);
        array[1] = 10;
        System.out.println(list1); // Prints [1, 2, 3]

    }

    private static int m1() {
        try {
            int i = 10 / 0;
            System.out.println(1);
            return  1;
        }catch (Exception e){
            System.out.println(2);
            return 2;
        }finally {
            System.out.println(3);
            return 3;
        }
    }
}