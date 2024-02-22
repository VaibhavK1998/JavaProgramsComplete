package CollectionWork;


@FunctionalInterface  // note functional interface can have only one abstract method
interface TestingLambda {
    abstract public void result();
}

public class LambdaExpressionUse {
    public static void main(String[] args) {
        /* first way to implement interface methods using anonymous class
        TestingLambda testingLambda = new TestingLambda() {
            @Override
            public void result() {
                System.out.println("result printed");
            }
        };

        testingLambda.result();

*/

        /*
        //Way to implement functional interface method using lambda expression;
         TestingLambda testingLambda=()->{
           System.out.println("lambda expression works");
         };
         testingLambda.result();
        */
    }
    }


