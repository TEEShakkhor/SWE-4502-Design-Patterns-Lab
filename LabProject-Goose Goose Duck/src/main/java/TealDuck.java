public class TealDuck implements Quackable
{
    @Override
    public void quack() {
        System.out.println("TealDuck Quacks!");
    }

    @Override
    public String toString() {
        return "Teal Duck";
    }
}
