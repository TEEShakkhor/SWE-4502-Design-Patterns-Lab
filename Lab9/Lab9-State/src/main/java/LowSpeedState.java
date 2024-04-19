public class LowSpeedState implements FanState{
    @Override
    public void turnOn(Fan fan) {
        System.out.println("Fan is already on at low speed");
    }

    @Override
    public void turnOff(Fan fan) {
        System.out.println("Turning fan off");
        fan.setState(new OffState());
    }

    @Override
    public void increaseSpeed(Fan fan) {
        System.out.println("Increasing fan speed to high");
        fan.setState(new HighSpeedState());
    }

    @Override
    public void decreaseSpeed(Fan fan) {
        System.out.println("Fan speed decreased to off");
        fan.setState(new OffState());
    }
}
