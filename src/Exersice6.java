import com.sun.scenario.effect.Identity;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exersice6 {
    public static void main(String[] args) {
        List<Integer> stream = new ArrayList<>(Arrays.asList(1, 2, 2, 5, 6, 8, 8, 4, 4, 4, 3, 9, 9));
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> collect = stream.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect);
 //-----------------------------------------------
        List<Integer> collect1 = stream.stream().filter(i -> Collections.frequency(stream, i) > 1)
                .collect(Collectors.toList());
        System.out.println(collect1);
 //---------------------------------------------------
        long count = stream.stream()
                .collect(Collectors.groupingBy(stream::get, Collectors.counting()))
                .values().stream().filter(i -> i > 1).count();
        System.out.println(count);
    }
}
