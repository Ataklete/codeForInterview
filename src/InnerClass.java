public abstract class InnerClass {

    interface Sample {
        void test();
    }

    public abstract void abstractAnonymous();

    public void anonymous(){
        System.out.println("anonymous");
    }

    abstract class A {
        public void m(){
            System.out.println("class A..");
        }
    }
    class B extends A {

    }

    public static void main(String[] args) {
        //implement abstract class right away-
        //if you have only one abstract method instead extend other class
        InnerClass main = new InnerClass() {
            public void abstractAnonymous(){
                System.out.println("from abstract implementation");
            }
        };
        B b = main.new B();
        b.m();

        //anonymous Inner Class
        InnerClass in = new InnerClass() {
            @Override
            public void abstractAnonymous() {
                // need implementation, If have abstract method
                System.out.println("fro abstractAnonymous...");
            }

            public void anonymous(){
                System.out.println("anonymous");
            }
        };
        in.anonymous();

        Sample s = new Sample() {
            @Override
            public void test() {
                System.out.println("test....");
            }
        };
    }
}
