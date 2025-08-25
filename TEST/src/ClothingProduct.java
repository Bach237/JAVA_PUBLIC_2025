public class ClothingProduct extends Product{

    public ClothingProduct(String id, String name, double price, int quantity, String category, Manufacturer manufacturer) {
        super(id, name, price, quantity, category, manufacturer);
    }

    @Override
    double getDiscountPrice() {
        return getPrice() - (getPrice() * 0.2);
    }

}
