public class FanExample {
    public static void main(String[] args) {
        Fan fan = new Fan();

        fan.turnOn(); // Output: Turning fan on to low speed
        fan.increaseSpeed(); // Output: Increasing fan speed to high
        fan.decreaseSpeed(); // Output: Decreasing fan speed to low
        fan.turnOff(); // Output: Turning fan off
        fan.decreaseSpeed(); // Output: Cannot decrease speed, fan is off
    }
}
