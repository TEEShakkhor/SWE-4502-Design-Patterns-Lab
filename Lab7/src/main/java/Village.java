import java.util.ArrayList;
import java.util.List;

public class Village implements VillageComponent{

    private List<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes(){
        return shapes;
    }
    private List<VillageComponent> components = new ArrayList<>();

    public void addComponent(VillageComponent component) {
        components.add(component);
    }

    public void removeComponent(VillageComponent component) {
        components.remove(component);
    }

    public List<VillageComponent> getComponents() {
        return components;
    }

    public void display() {
        System.out.println("Village Components:");
        for (VillageComponent component : components) {
            component.display();
        }
    }
}
