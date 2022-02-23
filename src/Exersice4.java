import java.util.Arrays;

public class Exersice4 {

    public static void main(String[] args) {

        int[] arr = {5,10,8, 6, 1, 7, 3, 9, 2, 4};

        System.out.println("----" + Arrays.toString(arr));

        int firstMax = 0;
        int secondMax = 0;
        int maxIndex = 0;
        int maxIndex2 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                secondMax = firstMax;
                maxIndex2 = maxIndex;
                firstMax = arr[i];
                maxIndex = i;
            } if(firstMax>arr[i] && arr[i]>secondMax) {
                secondMax = arr[i];
                maxIndex2 = i;
            }
        }
        System.out.println("the second largest number is: " + secondMax + " at index of " + maxIndex2);

        //second option
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res = arr[arr.length-2];
        }
        System.out.println("the second largest number is: " + res );
    }
}
