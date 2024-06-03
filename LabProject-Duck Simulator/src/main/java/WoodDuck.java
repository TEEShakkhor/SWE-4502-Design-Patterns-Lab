public class WoodDuck implements Quackable
{
    @Override
    public void quack() {
        System.out.println("WoodDuck Quacks!");
    }

    @Override
    public String toString() {
        return "Wood Duck";
    }
}
