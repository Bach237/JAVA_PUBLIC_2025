package Buoi7.BTVN;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'a' || s.charAt(i) == 'A') cnt1++;
            if(s.charAt(i) == 'e' || s.charAt(i) == 'E') cnt1++;
            if(s.charAt(i) == 'i' || s.charAt(i) == 'I') cnt1++;
            if(s.charAt(i) == 'o' || s.charAt(i) == 'O') cnt1++;
            if(s.charAt(i) == 'u' || s.charAt(i) == 'U') cnt1++;
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') cnt2++;
        }
        System.out.println(cnt1 + "\n" + cnt2);
    }
}
