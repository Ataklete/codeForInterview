public class ThreadCreation extends Thread {

        public static void main(String args[])
        {
            System.out.println("Thread id of Main thread is = "+
                    Thread.currentThread().getId() + Thread.currentThread().getName() + " Thread main");
            ThreadCreation obj = new ThreadCreation();
            Thread thread = new Thread(obj);
            System.out.println(thread.getName() + " thread ");
            thread.start();
            Thread thread1 = new Thread("ati");
            thread1.start();
            System.out.println(thread1.getName() + " thread1");
//            Runnable runnable = new ThreadCreation();
//            Thread thread1 = new Thread(runnable);
//            thread1.start();
        }
//        public void run()
//        {
//            System.out.println("Thread is running...");
//            System.out.println("Thread id of new thread is="+Thread.currentThread().getId());
//        }
}

