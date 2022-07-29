import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Digits {

    public static void main(String[] args) {
        int num = 5001;
//        while (num>0){
//            System.out.print(num%10);
//            num=num/10;
//        }

        String number = String.valueOf(num);
        char[] digits1 = number.toCharArray();
        for (Character  c : digits1)
            System.out.print(c);
// or:
        String[] digits2 = number.split("(?<=.)");
        for (String  c : digits2)
            System.out.print(c);
    }
}
