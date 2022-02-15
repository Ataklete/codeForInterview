import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exersice6 {
    public static void main(String[] args) {
        List<Integer> stream = new ArrayList<>(Arrays.asList(1, 2, 2, 5, 6, 8, 8, 4, 4, 4, 3, 9, 9));
        List<Integer> collect = stream.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);


    }
}
