import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Dep {

    public static void main(String[] args) {

        List<Integer> arr =
                Arrays.asList(92, 5, 8, 9, 45, 92, 8, 5);
//first option
        List<Integer>
                dup = arr.stream().distinct().collect(Collectors.toList());
        System.out.println(dup);
//second option
        System.out.println(arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i -> i.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));


    }
}
