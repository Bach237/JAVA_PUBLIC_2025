public interface ProductService {
    void addProduct(Product p);
    void updateProduct(String id, Product newInfo);
    void deleteProduct(String id);
    Product findByName(String name);
    void sortByPriceAsc();
    void sortByPriceDesc();
    void printProducts();

}
