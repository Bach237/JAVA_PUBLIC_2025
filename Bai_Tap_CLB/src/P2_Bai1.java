import java.util.Scanner;

public class P2_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        double r = sc.nextDouble();
        System.out.printf("%.3f %.3f", 2*pi*r, pi*r*r);
    }
}