public class MethodCallCounter {
    private static MethodCallCounter instance;
    private int callCount = 0;

    private MethodCallCounter() {
        System.out.println("Method call counter initialized.");
    }

    public static MethodCallCounter getInstance() {
        if (instance == null) {
            instance = new MethodCallCounter();
        }

        return instance;
    }

    public void incrementCallCount() {
        callCount++;
        System.out.println("Method called " + this.callCount + " times.");
    }

    public int getCallCount() {
        return callCount;
    }
}
