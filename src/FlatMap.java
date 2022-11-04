import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap  {

    public static void main(String[] args) {
        String st = "enterprisejavaprogramming";
        char[] ch = st.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0; i<ch.length; i++){
            if(!map.containsKey(ch[i]) )
               map.put(ch[i], 1);
            else
                map.put(ch[i], map.get(ch[i]) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character,Integer> s : map.entrySet()){
            if(s.getValue()!=1) {
                sb.append(s.getKey()).append("=").append(s.getValue()).append("\n");
            }
            else{
                sb.append(s.getKey());
            }
        }
        System.out.println(sb);
        System.out.println("------------- using stream ---------------");
        String[] split = st.split("");
        Arrays.stream(split).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x->x.getValue()>1)
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(y-> System.out.println(y));
        int size = Runtime.getRuntime().availableProcessors();
        System.out.println("Run....... " + size);

        System.out.println("===========");
        map.entrySet().stream()
                .filter(e->e.getValue()>1)
                .forEach(z-> System.out.println(z.getKey() + "=" + z.getValue()));
        System.out.println("_-----------");
        System.out.println(map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.naturalOrder()))
                .collect(Collectors.toList()));

        List<String> list1 = Arrays.asList("John", "Rahul","David");

        List<String>  list2  = Arrays.asList("Kiran", "Sam", "James");

        List<String>  list3 = Arrays.asList("Walter", "Suman", "Suresh", "Jonathan");

        List<String>  list4 = Arrays.asList("Johney", "Sean","Jude");

        List<String> str1 = Stream.of(list1,list2,list3,list4)
                            .flatMap(str->str.stream().filter(a->a.startsWith("J")))
                            .collect(Collectors.toList());

        System.out.println(str1);

        String[] names = {
                "Haftom", "Mesfin"
        };

        Arrays.stream(names)
                .forEach(System.out::println);

        Integer numbers[][] = new Integer[][] {
                {1,2,3}, {4,5}
        };
        Arrays.stream(numbers)
                .forEach(System.out::println);

        Arrays.stream(numbers)
                .flatMap(x->Arrays.stream(x))
                .forEach(System.out::println);

        List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6,7));

        listOfLists.stream().forEach(System.out::println);

        listOfLists.stream()
                .flatMap(x->x.stream())
                .forEach(System.out::println);

        List<Integer> afterFlatMap = listOfLists.stream()
                .flatMap(x->x.stream())
                .collect(Collectors.toList());
        System.out.println(afterFlatMap);




    }
}
