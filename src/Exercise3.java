import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Exercise3 {

    public   interface a {
        int method1(int x);
    }
    public   interface b {
        int method1(int x);
    }
    class C implements a,b {
        @Override
        public int method1(int x) {
            return x +1;
        }
    }
    public static void main(String[] args) {
      Exercise3 e = new Exercise3();
      Exercise3.C test = e.new C();
        System.out.println(test.method1(5));
 //---------------------------------------------------------------------------
        int data[][] = {{2, 10}, {1, 3}};
        int len = data.length - 1;
        Arrays.sort(data, (o1, o2) -> Integer.compare(o1[0],o2[0]));
//        Arrays.sort(data, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                if (o1[0]>(o2[0]))
//                    return 1;
//                else
//                    return -1;
//            }
//
//        });

        System.out.println("comparator sorted array");
        for (int i = 0; i <= len; ++i) {
            for (int j = 0; j <= data[i].length - 1; ++j) {
                System.out.println(data[i][j]);
            }
        }


            for(int i = 0; i <= len; ++i) {
                for (int j = 0; j <= len; ++j) {
                    for (int k = 0; k <= len; ++k) {
                        for (int l = 0; l <= len; ++l) {

                            if (data[i][j] < data[k][l]) {
                                //swap
                                int temp = data[i][j];
                                data[i][j] = data[k][l];
                                data[k][l] = temp;
                            }
                            }
                        }
                    }
                }
        System.out.println("sorted array");
        for (int i = 0; i <= len; ++i) {
            for (int j = 0; j <= data[i].length - 1; ++j) {
                System.out.println(data[i][j]);
            }
        }

  //------------------------------------------------
        String[][] array = {{"saba","henok"},{"ati","helen"}, {"tibe", "haile"}};
        String small = "";
                int row = 0, col = 0, z;
        for(int k = 0; k < array.length; k++)
        {
            for(int p = 0; p < array[k].length; p++)
            {
                small = array[k][p];
                for(int i = k; i < array.length; i++)
                {
                    if(i == k)
                        z = p + 1;
                    else
                        z = 0;
                    for(;z < array[i].length; z++)
                    {
                        if(array[i][z].compareTo(small)<0)
                        {
                            small = array[i][z];
                            row = i;
                            col = z;
                        }
                    }
                }
//                System.out.println("=============================");
                array[row][col] = array[k][p];
                array[k][p] = small;
                System.out.print(array[k][p] + " ");
            }
//            System.out.println();
        }
//        System.out.println("sorted by two for loop");
//        for (int i = 0; i <= len; ++i) {
//            for (int j = 0; j <= data[i].length - 1; ++j) {
//                System.out.println(data[i][j]);
//            }
//        }
    }
}
