import java.io.IOException;

public class PrimeNumber {

    public static void main(String[] args) throws IOException {
        int[] num = {2, 3, 10, 7, 15, 5, 9, 20, 21, 13, 6, 8,17,23,37};
        primeNumber(num);
    }
    private static void primeNumber(int[] num) {
        int  count =0;
        for (int j=0; j<num.length; j++){
            for (int k=1; k<=num[j]; k++){
                if(num[j]%k==0)
                    count++;
            }
            if(count==2)
                System.out.println(num[j]);
            count=0;
        }
    }
}