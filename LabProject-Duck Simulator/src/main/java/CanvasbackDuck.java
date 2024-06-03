public class CanvasbackDuck implements Quackable
{
    @Override
    public void quack() {
        System.out.println("CanvasbackDuck Quacks!");
    }

    @Override
    public String toString() {
        return "Canvasback Duck";
    }
}
