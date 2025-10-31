import java.util.Arrays;

 void main() {
        int[] arr = {10,20,30,40,50};
        System.out.println("****Original Array****");
        printArray(arr);
        rotateArray(arr);
        System.out.println("****Reversed Array****");
        printArray(arr);
    }

    private void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    private void rotateArray(int[] arr) {
                if (arr == null || arr.length < 2) return;

                int left = 0, right = arr.length - 1;
                while (left < right) {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                    left++;
                    right--;
                }
        }
