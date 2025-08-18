import java.io.IOException;

public class PrimeNumber {

    public static void main(String[] args) throws IOException {
        int[] num = {2, 3, 10, 7, 15, 5, 9, 20, 21, 13, 6, 8, 17, 23, 37};
        primeNumber(num);

        System.out.println("********test-2*******************");

        int[] ints = primeNumber_test2(num);
        for (Integer a : ints) {
            System.out.println(a);
        }
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

private static int[] primeNumber_test2(int[] num) {
    int[] result = new int[num.length * 2];
    int k = 0;

    for (int i = 0; i < num.length - 1; i++) {
        if (num[i] == 2 || num[i] == 3) {
            result[k++] = num[i];
        } else {
            for (int j = 2; j < num[i] / 2; j++) {
                if (num[i] % j == 0) {
                    break;
                } else {
                    result[k++] = num[i];
                }
            }
        }
    }
    return result;
}
}

