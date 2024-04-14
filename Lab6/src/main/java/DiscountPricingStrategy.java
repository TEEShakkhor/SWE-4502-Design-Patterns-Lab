public class DiscountPricingStrategy implements PricingStrategy
{
    @Override
    public double calculatePrice(double basePrice) {
        return 0.9 * basePrice; // 10% discount
    }
}
