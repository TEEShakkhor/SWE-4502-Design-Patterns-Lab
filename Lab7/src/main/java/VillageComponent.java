import java.util.ArrayList;
import java.util.List;

public interface VillageComponent {
    void display();

    public List<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape shape);

    public List<Shape> getShapes();
}
