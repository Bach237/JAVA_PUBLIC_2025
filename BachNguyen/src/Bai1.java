import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 1];
        for(int i = 1; i <= n; i++){
            a[i] = sc.nextInt();
        }

        int[] Min = new int[n + 1];
        int[] Sum = new int[n + 1];
        Min[n] = a[n];
        Sum[n] = a[n];
        for(int i = n - 1; i >= 1; i--){
            Min[i] = Math.min(a[i], Min[i + 1]);
            Sum[i] = a[i] + Sum[i + 1];
        }

        int Max = 0;
        int[] k = new int[n - 1];
        for(int i = 1; i <= n - 2; i++){
            int res = (Sum[i + 1] - Min[i + 1]) / (n - (i + 1));
            Max = Math.max(Max, res);
            k[i] = res;
        }
        for(int i = 1; i <= n - 2; i++){
            if(k[i] == Max){
                System.out.print(i + " ");
            }
        }
    }
}