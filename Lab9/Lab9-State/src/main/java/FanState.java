public interface FanState {
    void turnOn(Fan fan);
    void turnOff(Fan fan);
    void increaseSpeed(Fan fan);
    void decreaseSpeed(Fan fan);
}
