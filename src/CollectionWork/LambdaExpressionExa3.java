package CollectionWork;

@FunctionalInterface
interface Checks {
    abstract public int total(int a, int b);
}

public class LambdaExpressionExa3 {
    public static void main(String[] args) {
        Checks checks = (a, b) -> a + b;
        int sum = checks.total(30, 40);
        System.out.println(sum);

    }

    public static void checkMethod(){

    }
}
