
public class RowCol {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int row = 4,col = 5,len = arr.length,count=0;
        for (int j=0; j <=row-1; j++) {
            for (int i = 0; i < len; i++) {
                if (count++ % col == 0)
                    System.out.println();
                System.out.print(arr[i]);
            }
            count=1;
        }
    }
}
