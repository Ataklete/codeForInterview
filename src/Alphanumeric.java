
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;


/*
* Open any Java compiler and write code to solve this problem. Show your screen.
If a=1, b=2, c=3, …………. z= 26, and 1=1, 2=2, 3=3, etc.; input an alphanumeric string and calculate the sum of that string.
Input: hello123
Output: 58
(Where h=8, e=5, l=12, l=12, o=15, 1=1, 2=2, 3=3)
has context menu
Compose*/
public class Alphanumeric {

    public static int alphanumeric(char[] charArray){
        Map<Character, Integer> alpNum = new HashMap<>();
        alpNum.put('o',15);
        alpNum.put('h', 8);
        alpNum.put('e', 5);
        alpNum.put('l', 12);

        int sum = 0;
        for (Character c : charArray) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            } else {
                sum += alpNum.entrySet().stream()
                        .filter(e -> e.getKey().equals(c))
                        .map(e -> e.getValue())
                        .reduce(0, (x, y) -> x + y);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "hello123";
        System.out.println(alphanumeric(s.toCharArray()));
    }
}
