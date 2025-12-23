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

    public static void sumToNumbersWithMap(int[] arr){

        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = i; j <= arr.length - 1; j++) {
                map.put(Math.abs(arr[i] + arr[j]), Arrays.asList(arr[i], arr[j]));
            }
        }
        System.out.println(map.entrySet().stream().filter(x -> x.getKey() >= 0).findFirst().get().getValue());
    }
    public static void sumToNumbers(int[] arr){

                // Edge case: need at least two elements
                if (arr == null || arr.length < 2) {
                    System.out.println("Array must contain at least two elements.");
                    return;
                }

                // Step 1: Sort the array
                Arrays.sort(arr);

                // Step 2: Initialize pointers
                int left = 0;
                int right = arr.length - 1;

                // Store the result
                int minSum = Integer.MAX_VALUE;
                int minLeft = left;
                int minRight = right;

                // Step 3: Two-pointer traversal
                while (left < right) {
                    int sum = arr[left] + arr[right];

                    // Update minimum if needed
                    if (Math.abs(sum) < Math.abs(minSum)) {
                        minSum = sum;
                        minLeft = left;
                        minRight = right;
                    }

                    // Move pointers
                    if (sum < 0) {
                        left++;
                    } else if (sum > 0) {
                        right--;
                    } else {
                        // Perfect zero sum found
                        break;
                    }
                }

                // Output the result
                System.out.println("The two elements whose sum is closest to zero are: "
                        + arr[minLeft] + " and " + arr[minRight]);
                System.out.println("Sum = " + minSum);
            }
    }
    void main() {

        Sumoftwo.sumToNumbers(new int[]{2, 8, 7, 0, -1, -5, 3, -2});
        Sumoftwo.sumToNumbers(new int[]{13, 1, 4, 6, -2, -9, -20});

        }






