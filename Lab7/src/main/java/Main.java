public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle();

        Triangle tr1 = new Triangle();

        Circle  cir1 = new Circle();

        Circle  cir2 = new Circle();

        VillageComponent pond = new WaterSource("pond");
        pond.addShapes(cir1);
        pond.addShapes(rect1);
        System.out.println("pond is built with: ");
        System.out.println(pond.getShapes());


        VillageComponent tinhouse = new House("tinhouse");
        tinhouse.addShapes(cir1);
        tinhouse.addShapes(rect1);
        tinhouse.addShapes(tr1);
        System.out.println("tinhouse is built with: ");
        System.out.println(tinhouse.getShapes());





        VillageBuilder builder = new VillageBuilder();
        Village brickhouse = builder.buildBrickHouse();
        System.out.println("BrickHouse components");
        VillageIterator iterator1 = new VillageIterator(brickhouse.getComponents());

        while (iterator1.hasNext()) {
            iterator1.next().display();
        }

        Village mudhouse = builder.buildMudHouse();
        System.out.println("MudHouse components");
        VillageIterator iterator2 = new VillageIterator(mudhouse.getComponents());

        while (iterator2.hasNext()) {
            iterator2.next().display();
        }
    }
}
