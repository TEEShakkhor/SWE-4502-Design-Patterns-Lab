public class OffState implements FanState {
    @Override
    public void turnOn(Fan fan) {
        System.out.println("Turning fan on to low speed");
        fan.setState(new LowSpeedState());
    }

    @Override
    public void turnOff(Fan fan) {
        System.out.println("Fan is already off");
    }

    @Override
    public void increaseSpeed(Fan fan) {
        System.out.println("Cannot increase speed, fan is off");
    }

    @Override
    public void decreaseSpeed(Fan fan) {
        System.out.println("Cannot decrease speed, fan is off");
    }
}
