package nested.test;

public class OuterClass3 {
    public void myMethod() {

        class localClass {

            public void hello() {
                System.out.println("localClass.hello");
            }
        }

        localClass local = new localClass();
        local.hello();
    }
}
