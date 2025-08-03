import java.util.Scanner;

public class P1_Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int sum = 0;
        int max;

        System.out.println("Nhập 5 số nguyên:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.print("Các phần tử vừa nhập: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        sum = a[0];
        max = a[0];
        for (int i = 1; i < 5; i++) {
            sum += a[i];
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Tổng các phần tử: " + sum);
        System.out.println("Giá trị lớn nhất: " + max);

        sc.close();
    }
}


