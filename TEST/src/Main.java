import java.util.Scanner;

public class Main {
    public void function() {
        System.out.println("===== QUẢN LÝ SẢN PHẨM =====");
        System.out.println("1. Thêm sản phẩm");
        System.out.println("2. Sửa thông tin sản phẩm theo ID");
        System.out.println("3. Xóa sản phẩm theo ID");
        System.out.println("4. Xóa sản phẩm theo ID");
        System.out.println("5. In danh sách sản phẩm");
        System.out.println("6. Sắp xếp theo giá tăng dần");
        System.out.println("7. Sắp xếp theo giá giảm dần");
        System.out.println("0. Thoát");
        System.out.print("Chức năng bạn muốn chọn là: ");
    }

    public static void main(String[] args) {
        ProductServiceImpl quanly = new ProductServiceImpl();
        Scanner sc = new Scanner(System.in);

        int enter;
        do {

            enter = sc.nextInt();

            if(enter == 1) {

            } else if (enter == 2) {
                System.out.println("Nhap ID can sua");
                String tmp = sc.nextLine();
                System.out.println("Moi nhap san pham sua");

            } else if (enter == 3) {
                System.out.println("Nhap ID can xoa");
                String id = sc.nextLine();
                quanly.deleteProduct(id);

            } else if (enter == 4) {
                System.out.println("Nhap ten can tim");
                String name = sc.nextLine();
                quanly.findByName(name);
            } else if (enter == 5) {
                quanly.printProducts();

            } else if (enter == 5) {
                quanly.sortByPriceAsc();
            } else if (enter == 6) {
                quanly.sortByPriceDesc();

            }


        }while(enter != 0);

    }

}
