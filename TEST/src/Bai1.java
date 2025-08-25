import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] c = new boolean[300];
        String s = sc.nextLine();
        boolean check = true;
        for(int i = 0; i < s.length(); i++) {
            c[(int)s.charAt(i)] = true;
            if(c[(int)s.charAt(i)]) {
                check = false;
                break;
            }
        }

        int cnt = 0;
        String sNew = "";
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ') cnt++;
            sNew = s.charAt(i) + sNew;
        }
        System.out.println(check);
        System.out.println(cnt);
        System.out.println(sNew);

    }
}
