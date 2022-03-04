import java.util.Arrays;

public class BubbleSort extends Sorter{

    int[] arr;
    public int[] sort(int[] array){
        this.arr = array;
        bubbleSort();
        return arr;

    }
    private void bubbleSort(){

        int len = arr.length;
        for(int i = 0; i < len; ++i) {
            for(int j = 0; j < len-1; ++j) {
                if(arr[j]> arr[j+1]){
                    swap(j,j+1);
                }
            }
        }
    }

    int[] swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;

    }
    public static void main(String[] args){
        int[] test = {21,13,1,-22, 51, 5, 18};
        BubbleSort bs = new BubbleSort();

        System.out.println(Arrays.toString(bs.sort(test)));

    }

    //------2d bubbleSort array ---------------------------------------------------------------------
//    public static void main(String[] args) {
//
//        int data[][] = {{2, 10}, {1, 3}};
//        int len = data.length - 1;
//
//        System.out.println("comparator sorted array");
//        for (int i = 0; i <= len; ++i) {
//            for (int j = 0; j <= data[i].length - 1; ++j) {
//                System.out.println(data[i][j]);
//            }
//        }
//
//
//            for(int i = 0; i <= len; ++i) {
//                for (int j = 0; j <= len; ++j) {
//                    for (int k = 0; k <= len; ++k) {
//                        for (int l = 0; l <= len; ++l) {
//
//                            if (data[i][j] < data[k][l]) {
//                                //swap
//                                int temp = data[i][j];
//                                data[i][j] = data[k][l];
//                                data[k][l] = temp;
//                            }
//                            }
//                        }
//                    }
//                }
//        System.out.println("sorted array");
//        for (int i = 0; i <= len; ++i) {
//            for (int j = 0; j <= data[i].length - 1; ++j) {
//                System.out.println(data[i][j]);
//            }
//        }
//
//  //------------------------------------------------
//        String[][] array = {{"saba","henok"},{"ati","helen"}, {"tibe", "haile"}};
//        String small = "";
//                int row = 0, col = 0, z;
//        for(int k = 0; k < array.length; k++)
//        {
//            for(int p = 0; p < array[k].length; p++)
//            {
//                small = array[k][p];
//                for(int i = k; i < array.length; i++)
//                {
//                    if(i == k)
//                        z = p + 1;
//                    else
//                        z = 0;
//                    for(;z < array[i].length; z++)
//                    {
//                        if(array[i][z].compareTo(small)<0)
//                        {
//                            small = array[i][z];
//                            row = i;
//                            col = z;
//                        }
//                    }
//                }
////                System.out.println("=============================");
//                array[row][col] = array[k][p];
//                array[k][p] = small;
//                System.out.print(array[k][p] + " ");
//            }
////            System.out.println();
//        }
////        System.out.println("sorted by two for loop");
////        for (int i = 0; i <= len; ++i) {
////            for (int j = 0; j <= data[i].length - 1; ++j) {
////                System.out.println(data[i][j]);
////            }
////        }
//    }
}
