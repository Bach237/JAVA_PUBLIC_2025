public class P1_Bai5 {
    public static void main(String[] args) {

        // Bảng cửu chương số 5
        System.out.println("Bảng cửu chương số 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

        // Tính tổng số chẵn từ 1 đến 100 bằng vòng lặp for
        int sumFor = 0;
        for (int i = 2; i <= 100; i += 2) {
            sumFor += i;
        }
        System.out.println("\nTổng các số chẵn từ 1 đến 100 (for): " + sumFor);

        // Tính tổng số chẵn từ 1 đến 100 bằng vòng lặp while
        int sumWhile = 0;
        int i = 2;
        while (i <= 100) {
            sumWhile += i;
            i += 2;
        }
        System.out.println("Tổng các số chẵn từ 1 đến 100 (while): " + sumWhile);
    }
}
