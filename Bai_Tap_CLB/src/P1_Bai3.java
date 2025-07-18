import java.util.Scanner;

public class P1_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lặp 5 lần để nhập 5 cặp số
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cặp số thứ " + i + ":");

            System.out.print("Nhập số thứ nhất: ");
            int a = sc.nextInt();

            System.out.print("Nhập số thứ hai: ");
            int b = sc.nextInt();

            System.out.println("Tổng: " + (a + b));
            System.out.println("Hiệu: " + (a - b));
            System.out.println("Tích: " + (a * b));

            if (b != 0) {
                System.out.println("Thương: " + (a / b));
                System.out.println("Chia lấy dư: " + (a % b));
            } else {
                System.out.println("Không thể chia hoặc chia dư cho 0.");
            }

            if (a == b) {
                System.out.println("Hai số bằng nhau.");
            } else {
                System.out.println("Hai số khác nhau.");
            }

            System.out.println("-----------------------------");
        }

    }
}
