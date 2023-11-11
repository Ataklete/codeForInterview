import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NthLargestSalary {

  public static void nthLargest(Map<String, Integer> map, int sum){
      //logic
      System.out.println(map.entrySet().stream()
              .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
              .entrySet()
              .stream()
              .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
              .collect(Collectors.toList()).get(sum-1));
  }


    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("ati", 1200);
        map.put("haile", 1300);
        map.put("teffer", 1400);
        map.put("ati", 1200);
        map.put("haile", 1300);
        map.put("teffera", 1500);
        map.put("tom", 1000);
        map.put("king", 1500);
        map.put("eleni", 900);

        nthLargest(map, 2);

        System.out.println("---------Integer 2D Array With Flat Stream------------------");

        Integer num[][] = {{1, 2, 3}, {8, 9, 10}, {15, 18, 19}};
        System.out.println(
                Arrays.stream(num)
                        .flatMap(a -> Arrays.stream(a))
                        .sorted(Collections.reverseOrder())
                        .collect(Collectors.toList())
                        .get(2));
    }
}
