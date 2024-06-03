import java.util.ArrayList;
import java.util.List;

public class QuackCounter implements Quackable{
    Quackable duck;
    static int numberOfQuacks = 0;
    List<Observer> observers = new ArrayList<>();

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
        notifyObservers();
    }

    public static int getQuackCount() {
        return numberOfQuacks;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public String toString() {
        return duck.toString(); // Assuming duck classes override toString() appropriately
    }

}
