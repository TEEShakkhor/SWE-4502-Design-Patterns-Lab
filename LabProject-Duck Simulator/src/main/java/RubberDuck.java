public class RubberDuck implements Quackable
{
    @Override
    public void quack() {
        System.out.println("RubberDuck Quacks!");
    }

    @Override
    public String toString() {
        return "Rubber Duck";
    }
}
