
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
        return sum;
    }

    public static void main(String[] args) throws IOException {
        String s = "hello123";
//        System.out.println(alphanumeric(s.toCharArray()));
        int[] num = {2, 3, 10, 7, 15, 5, 9, 20, 21, 13, 6, 8};

        int[] ints = primeNumber(num);
        for (Integer a : ints) {
            System.out.println(a);
        }
    }
//        System.out.println("Enter a number");
//        InputStreamReader reader = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(reader);
//        int line = Integer.parseInt(br.readLine());
//        br.close();
/*        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        for (int i = 0; i <= line; i++) {
            i *=5;
            System.out.println(i + " *" + " 5 " + " = " +i*5);
        }
    }*/

    private static int[] primeNumber(int[] num) {
        int[] result = new int[num.length * 2];
        int k = 0;

        for (int i = 0; i < num.length - 1; i++) {
            if (num[i]==2 || num[i]==3){
                result[k++] = num[i];
            }else {
                for (int j = 2; j < num[i] / 2; j++) {
                    if (num[i] % j == 0) {
                        break;
                    }else {
                        result[k++] = num[i];
                    }
                }
            }
        }
        return result;
    }

}
