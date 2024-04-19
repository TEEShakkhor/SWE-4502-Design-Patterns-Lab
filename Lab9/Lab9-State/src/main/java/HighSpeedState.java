public class HighSpeedState implements FanState{
    @Override
    public void turnOn(Fan fan) {
        System.out.println("Fan is already on at high speed");
    }

    @Override
    public void turnOff(Fan fan) {
        System.out.println("Turning fan off");
        fan.setState(new OffState());
    }

    @Override
    public void increaseSpeed(Fan fan) {
        System.out.println("Fan is already on at high speed");
    }

    @Override
    public void decreaseSpeed(Fan fan) {
        System.out.println("Decreasing fan speed to low");
        fan.setState(new LowSpeedState());
    }
}
