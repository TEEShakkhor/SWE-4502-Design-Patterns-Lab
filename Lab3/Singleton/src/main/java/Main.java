
public class Main {
    public static void main(String[] args) {
        MethodCallCounter counter1 = MethodCallCounter.getInstance();
        MethodCallCounter counter2 = MethodCallCounter.getInstance();

        counter1.incrementCallCount();
        counter2.incrementCallCount();
        counter1.incrementCallCount();

        System.out.println("Call count from counter1: " + counter1.getCallCount());
        System.out.println("Call count from counter2: " + counter2.getCallCount());

        // Both counters should be the same instance
        System.out.println("counter1 == counter2: " + (counter1 == counter2));
    }
}