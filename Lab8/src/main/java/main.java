public class main {
    public  static void main(String[] args){
        RenderObject renderobject;
        GameObject car = new Vehicle("car", new Car());
        GameObject bike = new Vehicle("car", new Bike());

        bike.render();
        car.render();

    }


}
