public class Vehicle extends GameObject{
    private String status;
    public Vehicle(String status, RenderObject renderobject){
        super(renderobject);
        this.status=status;
    }
    public void render(){
        renderobject.renderVehicle("Vehicle");
    }
}
