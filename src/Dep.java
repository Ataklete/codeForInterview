import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

//change to capital the first character
        System.out.println("-----using stream----");
        String str = "input to output with capital letter";
        long start = System.currentTimeMillis();
        String arrStr[] = str.split(" ");
        Stream.of(arrStr).
                map(x -> x.substring(0, 1).
                        toUpperCase() + x.substring(1) + " ")
                .forEach(y -> System.out.print(y));
        long end = System.currentTimeMillis();
        System.out.println();
        System.out.println("finished : " + (end - start));

        System.out.println();
        long start1 = System.currentTimeMillis();
        for(String s : arrStr){
            System.out.print(s.substring(0,1).toUpperCase() + s.substring(1) + " ");
        }
        System.out.println();
        long end1 = System.currentTimeMillis();
        System.out.println("finished forEach loop: " + (end1 - start1));
        System.out.println("-----////////-----------===========");
//        Stream.of(str.split(" ")).flatMap(s -> Stream.of(str.split(" ")).map(x -> x.substring(0, 1).
//                toUpperCase() + x.substring(1) + " ")).forEach(System.out::print);
        //??????????????
        System.out.println("????????????????????????????");
        Stream.of(str.split(" ")).map(x -> x.substring(0, 1).
                toUpperCase() + x.substring(1) + " ").forEach(System.out::print);

    }
}
