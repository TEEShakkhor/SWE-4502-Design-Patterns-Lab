import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {
    List<Quackable> ducks = new ArrayList<>();

    public void add(Quackable duck)
    {
        ducks.add(duck);
    }

    public void quack() {
        for (Quackable duck : ducks) {
            duck.quack();
        }
    }

    public Iterator<Quackable> createIterator() {
        return new FlockIterator(ducks.iterator());
    }
}