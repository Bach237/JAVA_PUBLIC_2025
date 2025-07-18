import java.util.Scanner;

public class P2_Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int h1 = 0, h2 = n-1, c1 = 0, c2 = n-1, cnt = 1;

        while(h1 <= h2 && c1 <= c2){
            //xay dung hang tren
            for(int i = c1; i <= c2; i++){
                a[h1][i] = cnt;
                cnt++;
            }
            h1++;
            //xay dung cot phai
            for(int i = h1; i <= h2; i++){
                a[i][c2] = cnt;
                cnt++;
            }
            c2--;
            //xay dung hang duoi
            for(int i = c2; i >= c1; i--){
                a[h2][i] = cnt;
                cnt++;
            }
            h2--;
            //xay dung cot trai
            for(int i = h2; i >= h1; i--){
                a[i][c1] = cnt;
                cnt++;
            }
            c1++;
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
