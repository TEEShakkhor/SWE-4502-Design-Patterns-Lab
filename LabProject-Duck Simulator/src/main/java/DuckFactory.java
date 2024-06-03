public class DuckFactory
{
    public Quackable createDuck(String type) {
        if ("Teal".equals(type)) {
            return new TealDuck();
        }
        else if ("Wood".equals(type)) {
            return new WoodDuck();
        }
        else if ("Rubber".equals(type)) {
            return new RubberDuck();
        }
        else if ("Canvasback".equals(type)) {
            return new CanvasbackDuck();
        }

        return null;
    }
}
