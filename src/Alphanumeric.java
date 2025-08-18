
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;


/*
* Open any Java compiler and write code to solve this problem. Show your screen.
If a=1, b=2, c=3, …………. z= 26, and 1=1, 2=2, 3=3, etc.; input an alphanumeric string and calculate the sum of that string.
Input: hello123
Output: 58
(Where h=8, e=5, l=12, l=12, o=15, 1=1, 2=2, 3=3)
has context menu
Compose*/
public class Alphanumeric {

    public static int alphanumeric(char[] charArray) {
        AtomicInteger atomicInteger = new AtomicInteger(1);
        Map<Character, Integer> alpNum = new HashMap<>();
        for (Character ch : "abcdefghigklmnopqrstvwxyz".toCharArray()) {
            alpNum.put(ch, atomicInteger.getAndIncrement());
        }
        int sum = 0;
        for (Character c : charArray) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            } else {
                sum += alpNum.get(c);
//                sum += alpNum.entrySet().stream()
//                        .filter(e -> e.getKey().equals(c))
//                        .map(e -> e.getValue())
//                        .reduce(0, (x, y) -> x + y);
            }
        }

        //Second option
                for (char ch : charArray) {
                    if (ch >= 'a' && ch <= 'z') {
                        sum += ch - 'a' + 1; // ASCII of 'a' is 97
                    } else if (ch >= 'A' && ch <= 'Z') {
                        sum += ch - 'A' + 1; // ASCII of 'A' is 65
                    } else if (ch >= '0' && ch <= '9') {
                        sum += ch - '0';     // ASCII of '0' is 48
                    }
                }

                System.out.println("Sum of \"" + charArray + "\" is: " + sum);
        return sum;
    }

    public static void main(String[] args) throws IOException {
        String s = "hello123";
        System.out.println(alphanumeric(s.toCharArray()));
    }
}
