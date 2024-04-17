import java.util.ArrayList;
import java.util.List;

public class House implements VillageComponent{
    private String type;
    private List<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes(){
        return shapes;
    }
    public House(String type) {
        this.type = type;
        this.shapes=shapes;
    }

    public void display() {
        System.out.println("House: " + type);
    }
}
