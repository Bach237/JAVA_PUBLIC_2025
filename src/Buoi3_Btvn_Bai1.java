import java.util.Scanner;

public class Buoi3_Btvn_Bai1 {

    public static final String SQUARE = "Square";
    public static final String TRIANGLE = "Triangle";
    public static final String CIRCLE = "Circle";

    public static double dienTichVuong(Scanner sc) {
        System.out.print("Nhập cạnh hình vuông: ");
        double canh = sc.nextDouble();
        return canh * canh;
    }

    public static double dienTichTamGiac(Scanner sc) {
        System.out.print("Nhập chiều cao: ");
        double chieuCao = sc.nextDouble();
        System.out.print("Nhập đáy: ");
        double canhDay = sc.nextDouble();
        return 0.5 * chieuCao * canhDay;
    }

    public static double dienTichTron(Scanner sc) {
        System.out.print("Nhập bán kính: ");
        double banKinh = sc.nextDouble();
        return Math.PI * banKinh * banKinh;
    }

    public static double dienTichTinhToan(String type, Scanner sc){
            if (type.equals(SQUARE)) {
                return dienTichVuong(sc);
            } else if (type.equals(TRIANGLE)) {
                return dienTichTamGiac(sc);
            } else if (type.equals(CIRCLE)) {
                return dienTichTron(sc);
            }else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập 1 loại viên gạch (Square, Triangle, Cỉcle): ");
        String type = sc.nextLine();

        double dienTich = dienTichTinhToan(type, sc);

        if(dienTich >= 0){
            System.out.println("Diện tích của viên gạch là: " + dienTich);
        }else{
            System.out.println("Hình dạng không hợp lệ!");
        }
    }
}
