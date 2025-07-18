import java.util.Scanner;

public class P1_Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập tên của bạn: ");
        String ten = sc.nextLine();
        System.out.print("Hãy nhập tuổi của bạn: ");
        int tuoi = sc.nextInt();
        System.out.print("Hãy nhập chiều cao của bạn: ");
        float ccao = sc.nextFloat();
        System.out.print("Xin chào " + ten + ", bạn " + tuoi + " tuổi và cao " + ccao + " mét.");
    }
}