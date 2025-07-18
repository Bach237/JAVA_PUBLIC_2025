import java.util.Scanner;

public class P2_Bai2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int tmp = n;
        if(tmp % 2 == 0) tmp--;
        for(int i = 0; i < tmp; i++){
            if(i % 2 == 1){
                a[i] += Math.abs(a[i - 1] - a[i + 1]);
            }
        }
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
