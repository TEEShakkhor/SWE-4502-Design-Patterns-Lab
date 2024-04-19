public class Fan {
    private FanState currentState;

    public Fan() {
        // Initialize with the initial state (OffState)
        currentState = new OffState();
    }

    public void setState(FanState state) {
        this.currentState = state;
    }

    public void turnOn() {
        currentState.turnOn(this);
    }

    public void turnOff() {
        currentState.turnOff(this);
    }

    public void increaseSpeed() {
        currentState.increaseSpeed(this);
    }

    public void decreaseSpeed() {
        currentState.decreaseSpeed(this);
    }
}
