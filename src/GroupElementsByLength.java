import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupElementsByLength {
    public static void main(String[] args) {
  // Q1 Group array element based on the length of values ->OUTPUT: 4=[pear], 5=[apple, grape], 6=[banana]
        List<String> str = List.of("apple","banana","pear","grape");
        // Option 1
        System.out.println(str.stream()
                .collect(Collectors.groupingBy(a->a.length(),Collectors.toList()))
                .entrySet());
        // Option 2
        System.out.println(str.stream().collect(Collectors.groupingBy(String::length)));

  // Q2 Join all the words from the list into a single string
  // input list : ["Hello", " ", "world", "!"]
        List<String> strList = Arrays.asList("Hello", " ", "world", "!");
        System.out.println(strList.stream().reduce("",(x,y)-> x + y));
        System.out.println(strList.stream().collect(Collectors.joining()));
          }
}
