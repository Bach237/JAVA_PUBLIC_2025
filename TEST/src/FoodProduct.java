public class FoodProduct  extends  Product{

    public FoodProduct(String id, String name, double price, int quantity, String category, Manufacturer manufacturer) {
        super(id, name, price, quantity, category, manufacturer);
    }

    @Override
    double getDiscountPrice() {
        return getPrice() - (getPrice() * 0.05);
    }

}
