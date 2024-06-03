import java.util.Iterator;

public class FlockIterator implements Iterator<Quackable> {

    Iterator<Quackable> iterator;

    public FlockIterator(Iterator<Quackable> iterator) {
        this.iterator = iterator;
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Quackable next() {
        return iterator.next();
    }

}
