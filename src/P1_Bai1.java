import java.util.Scanner;

public class P1_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String name = sc.nextLine();

        System.out.print("Nhập tuổi của bạn: ");
        int age = sc.nextInt();

        System.out.print("Nhập chiều cao của bạn (mét): ");
        double height = sc.nextDouble();

        System.out.println("Xin chào " + name + ", bạn " + age + " tuổi và cao " + height + " mét.");
    }
}
