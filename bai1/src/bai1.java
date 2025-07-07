import java.util.Scanner;

public class bai1 {

    public static boolean kiemTra(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return n > 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int x : a){
            if(kiemTra(x)) System.out.println("Day la so nguyen to");
            else System.out.println("Day khong la so nguyen to");
        }
    }
}