public class CoffeeFactory
{
    public static Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Latte();
            // Add more coffee types as needed
            default:
                throw new IllegalArgumentException("Unknown coffee type: " + type);
        }
    }
}
