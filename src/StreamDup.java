import java.security.cert.CollectionCertStoreParameters;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDup {
    public static void main(String[] args) {
        List<Integer> stream = new ArrayList<>(Arrays.asList(1, 2, 2, 5, 6, 8, 8, 4, 4, 4, 3, 90, 95));
        Map<Integer, Integer> map = new HashMap<>();
        System.out.println("start with 4 " + stream.stream()
                                                .map(i->String.valueOf(i))
                                                .filter(j->j.startsWith("4"))
                                                .collect(Collectors.toList()));
        List<Integer> collect = stream.stream().filter(x->x.intValue()>5).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
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
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().filter(i -> i > 1).count();
        System.out.println("counting...." + count);


    List<String> str1 = Arrays.asList("a", "b", "c", "d");

    List<String> str2 = new ArrayList<>();
    str2.add("a");
    str2.add("b");

    List<String> nonDup = Stream.concat(str1.stream(), str2.stream())
                                 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                 .entrySet()
                                 .stream()
                                 .filter(i ->i.getValue()>1)
                                 .map(Map.Entry::getKey)
                                 .collect(Collectors.toList());

        System.out.println("dup in two Array--->soln1  "+nonDup);
        //-------------


        System.out.println("dup in two Array--->soln2 "+
                str1.stream().filter(s->str2.stream().anyMatch(p->p.equals(s)))
                        .collect(Collectors.toList()));
 }
}

