import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        System.out.println("--" +map.entrySet().stream().
                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList()));

        Stream.of(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .stream()
                .forEach(i -> System.out.println("key = " + i.getKey() + " "+ "value = " + i.getValue()));

        String s1 = "abc";
        String s2 = "abc";
        System.out.println("s1 == s2 is: " + s1 == s2);
    }
}
