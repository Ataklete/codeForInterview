import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
* Given an integer array, find two integers in the array whose sum is closest to zero
 Examples:
  input: [2,8,7,0,-1,-5,3,-2]
  output: 2, -2
  input: [13,1,4,6,-2,-9,-20]
  output: -2, 1*/
public class Sumoftwo {

    public static void main(String[] args) {

        int[] arr = {2, 8, 7, 0, -1, -5, 3, -2};
        int[] arr1 = {13, 1, 4, 6, -2, -9, -20};

        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                map.put(Math.abs(arr[i] + arr[j]), Arrays.asList(arr[i], arr[j]));
            }
        }
        System.out.println(map.entrySet().stream().filter(x -> x.getKey() >= 0).findFirst().get().getValue());
        }
    }





