public class CountingDuckFactory {
    public Quackable createDuck(String type) {
        Quackable duck = new DuckFactory().createDuck(type);
        return new QuackCounter(duck);
    }
}
