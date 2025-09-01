import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class OddEvenMultiThread extends Thread {
    static int i = 0;
    Object obj;

    public OddEvenMultiThread(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {

        for (; i <= 10; ) {
            if (i % 2 == 0 && Thread.currentThread().getName().equalsIgnoreCase("even")) {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + " Thread => EVEN Number: " + i);
                    i++;
                    obj.notify();
                }
            } else if (i % 2 != 0 && Thread.currentThread().getName().equalsIgnoreCase("odd")) {
                synchronized (obj) {
                    System.out.println(Thread.currentThread().getName() + " Thread => ODD Number: " + i);
                    i++;
                    obj.notify();
                }
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
//     =========Using Java 7 ====================
        Object obj = new Object();
        OddEvenMultiThread oe1 = new OddEvenMultiThread(obj);
        oe1.setName("Even");
        OddEvenMultiThread oe2 = new OddEvenMultiThread(obj);
        oe2.setName("Odd");
        oe1.start();
        oe2.start();

//        =======Using Completable Future========
        ExecutorService e = Executors.newFixedThreadPool(2);
        IntStream.range(1, 10).forEach(num -> {
            CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(num)
                    .thenApplyAsync(x -> {
                        if (x % 2 == 0) {
                            System.out.println(Thread.currentThread().getName() + " Thread => EVEN Number: " + x);
                        }
                        return num;
                    }, e);
            evenCompletableFuture.join();
            CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(num)
                    .thenApplyAsync(x -> {
                        if (x % 2 != 0) {
                            System.out.println(Thread.currentThread().getName() + " Thread => ODD Number: " + x);
                        }
                        return num;
                    }, e);
            oddCompletableFuture.join();
        });
        //        =======Using Completable Future =>runAsync========
        IntStream.range(1,10).forEach(num -> {
            CompletableFuture<Void> even = CompletableFuture.runAsync(() -> {
                    if (num % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " Thread => EVEN Number: " + num);
                    }
            }, e);
            even.join();
            CompletableFuture<Void> odd = CompletableFuture.runAsync(() ->{
                    if (num % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " Thread => ODD Number: " + num);
                    }
            },e);
            odd.join();
        });
        e.shutdown();
    }
}
