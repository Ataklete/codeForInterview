import java.util.Arrays;

public class rotate {
    public static int[] rotate(int arr[], int k) {
        int j = k, t = arr.length - 1 - k;
        int arrCopy[] = new int[arr.length];
        for (int i = arr.length - 1; i > k; i--) {
            if (j > 0)
                arrCopy[--j] = arr[i];
        }
        for (int s = 0; s <= t; s++) {
            arrCopy[k++] = arr[s];
        }
        return arrCopy;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        Arrays.stream(rotate(arr, 4)).forEach(System.out::println);
    }
}
