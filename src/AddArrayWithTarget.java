import java.util.Arrays;

public class AddArrayWithTarget {
    private static void sums(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    System.out.println(i + " " + j);
            }
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {5,2,7, 11, 15, 1,8};
        sums(arr, 9);
        Arrays.stream(twoSum(arr, 9)).forEach(System.out::println);
    }
}
