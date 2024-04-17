import java.util.ArrayList;
import java.util.List;

public class Tree implements VillageComponent{
    private String type;

    private List<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes(){
        return shapes;
    }

    public Tree(String type) {
        this.type = type;
        this.shapes=shapes;
    }

    public void display() {
        System.out.println("Tree: " + type);
    }
}
