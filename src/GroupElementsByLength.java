import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupElementsByLength {
    public static void main(String[] args) {
        // Q1 Group array element based on the length of values ->OUTPUT: 4=[pear], 5=[apple, grape], 6=[banana]
        List<String> str = List.of("apple", "banana", "pear", "grape", "blueberry");
        // Option one
        System.out.println(str.stream()
                .collect(Collectors.groupingBy(a -> a.length(), Collectors.toList()))
                .entrySet());
        // Option two
        System.out.println(str.stream().collect(Collectors.groupingBy(String::length)));

        // Q2 find the first element starting with character b
        System.out.println(str.stream().filter(c->c.startsWith("b")).findFirst().orElse("Not find in the list"));

        // Q3 Join all the words from the list into a single string
        // input list : ["Hello", " ", "world", "!"]
        List<String> strList = Arrays.asList("Hello", " ", "world", "!");
        System.out.println(strList.stream().reduce("", (x, y) -> x + y));
        System.out.println(strList.stream().collect(Collectors.joining()));

        // Q4 Print if all are even or odd
        List<Integer> num = Arrays.asList(2, 4, 6, 8);
        System.out.println(num.stream().allMatch(n -> n % 2 == 0));
    }
}
