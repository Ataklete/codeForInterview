import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuccessCountCharNumber {
    public static <T> HashMap<T, Integer> fun1(List<T> str){
        Map<T, Integer> map = new HashMap<>();

        for (int i = 0; i < str.size(); i++) {
            if (!map.containsKey(str.get(i))) {
                map.put(str.get(i), 1);
            } else {
                if(str.get(i)!=null) {
                    map.put(str.get(i), map.get(str.get(i)) + 1);
                }
            }
        }
        return (HashMap<T, Integer>) map;
    }
    public static void main(String[] args) {
        Map<String,Integer> fun = fun1(List.of("null","ati", "ati","henok","henok","helen"));
        fun.forEach((x,y)-> System.out.println(x + " = " + y));
        String str = "success";
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

//        for (int i = 0; i < chars.length; i++) {
//            if (!map.containsKey(chars[i])) {
//                map.put(chars[i], 1);
//            } else {
//                map.put(chars[i], map.get(chars[i]) + 1);
//            }
//        }
//        //check value
//        for (Map.Entry<Character, Integer> a : map.entrySet())
//            if (a.getValue() != 1)
//                System.out.println(a);
//            else
//                System.out.println(a.getKey());
//
//        //sorting by value
//        System.out.println(map.entrySet().stream().
//                sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .collect(Collectors.toList()));
//
        Stream.of(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .stream()
                .forEach(i -> System.out.println("key = " + i.getKey() + " " + "value = " + i.getValue()));
//        System.out.println("----common three char---------");
//        String str1 = "abcde";
//        String str2 = "aedif";
//        String str3 = "heade";
//        System.out.println(Stream.of(Arrays.stream(str1.split("")), Arrays.stream(str2.split("")),
//                        Arrays.stream(str3.split("")))
//                        .flatMap(x->Arrays.stream(x.toArray()))
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(x -> x.getValue() > 1)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList()));
//
//        String common = "";
//        for ( char c : str1.toCharArray()    ) {
//            if(str1.indexOf(c)!=-1 && str2.indexOf(c)!=-1 && str3.indexOf(c)!=-1)
//                common=common+c;
//        }
//        System.out.println("common char is : " + common);
    }
}
