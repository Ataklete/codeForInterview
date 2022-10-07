public class DefaultStatic implements E,D{

    private static final int value = 10;

    public  int getValue() {
        int value = 11;
        Runnable r = new Runnable() {
            int value = 12;
            @Override
            public void run() {
                System.out.println(this.value);
            }
        };
        r.run();
        System.out.println(value);
        return value;
    }

    @Override
    public void defaultMethod() {
        D.super.defaultMethod();
    }

    public static void main(String[] args) {
        DefaultStatic t = new DefaultStatic();
        t.defaultMethod();
        t.getValue();
    }
}
interface D {

    default void defaultMethod() {
        System.out.println(45);
    }
}
interface E {

    default void defaultMethod() {
        System.out.println(10);
    }
}