import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class VillageIterator implements Iterator<VillageComponent> {
    private List<VillageComponent> components;
    private int position = 0;

    public VillageIterator(List<VillageComponent> components) {
        this.components = components;
    }

    public boolean hasNext() {
        return position < components.size();
    }

    public VillageComponent next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        VillageComponent component = components.get(position);
        position++;
        return component;
    }
}
