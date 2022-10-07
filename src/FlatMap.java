import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

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
                .forEach(y-> System.out.println(y));

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

        List<String> str1 = Stream.of(list1,list2,list3,list4).flatMap(str->str.stream().filter(a->a.startsWith("J"))).collect(Collectors.toList());

        System.out.println(str1);






    }
}
