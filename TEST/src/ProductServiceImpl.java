import java.util.ArrayList;
import java.util.Comparator;

public class ProductServiceImpl implements ProductService{

    ArrayList<Product> products = new ArrayList<>();

    public ProductServiceImpl() {

    }

    @Override
    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Them thanh cong!");
    }

    @Override
    public void updateProduct(String id, Product newInfo) {
        boolean check = false;
        for (Product  p : products) {
            if(p.getId().equalsIgnoreCase(id)) {
                p = newInfo;
                check = true;
                System.out.println("Sua thanh cong!");
            }
        }
        if(!check) System.out.println("Khong tim thay id hop le!");
    }

    @Override
    public void deleteProduct(String id) {
        boolean check = false;
        for(Product p : products) {
            if(p.getId().equalsIgnoreCase(id)) {
                products.remove(p);
                check = true;
                System.out.println("Xoa thanh cong!");
            }
        }
        if(!check) System.out.println("Khong the xoa!");
    }

    @Override
    public Product findByName(String name) {
        for (Product p : products) {
            if(p.getName().equalsIgnoreCase(name)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void sortByPriceAsc() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getDiscountPrice() < o2.getDiscountPrice()){
                    return -1;
                } else if (o1.getDiscountPrice() > o2.getDiscountPrice()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Da sap xep giam dan!");
        printProducts();
    }

    @Override
    public void sortByPriceDesc() {
        products.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getDiscountPrice() < o2.getDiscountPrice()){
                    return 1;
                } else if (o1.getDiscountPrice() > o2.getDiscountPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Da sap xep tang dan!");
        printProducts();

    }

    @Override
    public void printProducts() {
        System.out.println("DANH SACH");
        System.out.println("ID   | Name |   Manufacturer  |  Quantity  |  price  |  Discount Price");
        for (Product p : products) {
            System.out.println(p);
        }
    }

}
