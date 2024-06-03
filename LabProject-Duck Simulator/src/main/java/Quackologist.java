public class Quackologist implements Observer{
    public void update(Quackable duck) {
        System.out.println("Quackologist: " + duck.toString() + " just quacked.");
    }
}
