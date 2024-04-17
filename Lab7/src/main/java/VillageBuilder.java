public class VillageBuilder {
    public Village buildBrickHouse(){
        Village village = new Village();
        village.addComponent(new House("Brick House"));
        village.addComponent(new Tree("Mango Tree"));
        village.addComponent(new WaterSource("Swimming Pool"));
        return village;
    }
    public Village buildMudHouse(){
        Village village = new Village();
        village.addComponent(new House("Mud House"));
        village.addComponent(new Tree("Banana Tree"));
        village.addComponent(new WaterSource("Pond"));
        return village;
    }
}
