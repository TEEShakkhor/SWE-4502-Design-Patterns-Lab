public class Main
{
    public static void main(String[] args)
    {
        PricingStrategy regularPricing = new RegularPricingStrategy();
        PricingStrategy discountPricing = new DiscountPricingStrategy();

        Coffee espresso = CoffeeFactory.createCoffee("espresso");
        Coffee latte = CoffeeFactory.createCoffee("latte");

        Coffee latteWithMilk = new MilkDecorator(latte);
        Coffee espressoWithSugar = new SugarDecorator(espresso);


        System.out.println("Regular Latte Price: " + regularPricing.calculatePrice(latte.cost()));
        System.out.println("Discounted Latte Price: " + discountPricing.calculatePrice(latte.cost()));
        System.out.println("Latte with Milk Price: " + latteWithMilk.cost());

        System.out.println("Regular Espresso Price: " + regularPricing.calculatePrice(espresso.cost()));
        System.out.println("Discounted Espresso Price: " + discountPricing.calculatePrice(espresso.cost()));
        System.out.println("Espresso with Sugar Price: " + espressoWithSugar.cost());


    }
}
