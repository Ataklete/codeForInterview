import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SuccessCountCharNumber {

    public static void main(String[] args) {
        String str = "success";

        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (!map.containsKey(chars[i])) {
                map.put(chars[i], 1);
            } else {
                map.put(chars[i], map.get(chars[i]) + 1);
            }
        }
        //check value
        for (Map.Entry<Character, Integer> a : map.entrySet())
            if (a.getValue() != 1)
                System.out.println(a);
            else
                System.out.println(a.getKey());

        //sorting by value
        System.out.println(map.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList()));
    }
}
