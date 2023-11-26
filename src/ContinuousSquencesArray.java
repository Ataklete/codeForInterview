import java.util.ArrayList;
import java.util.List;

public class ContinuousSquencesArray {

    public static void main(String[] args) {
        String strArr = "1 2 3 5 9 a 6 7 8 4 @ -5 -7 -3 -2 -1";
        String[] arr = strArr.split(" ");
        List<Integer> newArr = new ArrayList<>();

        int current = 0, previous = 0, next = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (!Character.isLetter((arr[i].charAt(0)))
                    && !Character.isLetter(arr[i - 1].charAt(0))
                    && !Character.isLetter(arr[i + 1].charAt(0))) {

                try {
                    current = Integer.parseInt(arr[i]);
                    previous = Integer.parseInt(arr[i - 1]);
                    next = Integer.parseInt(arr[i + 1]);

                    if (current - previous == 1 && next - current == 1) {
                        newArr.add(previous);
                        newArr.add(current);
                        newArr.add(next);
                    }
                } catch (NumberFormatException nfe) {
                    System.out.println("number format error : " + nfe);
                }
            }
        }
        for (Integer n : newArr) {
            System.out.println(n);
        }
    }
}
