import java.util.Scanner;

public class Buoi3_Btvn_Bai3 {

    public static final String DUNG = "phép tính đúng";
    public static final String SAI = "phép tính sai";

    public static void hienThi(Scanner sc){
        int a = (int)(Math.random() * 101);
        int b = (int)(Math.random() * 101);
        int c = (int)(Math.random() * 201);
        System.out.println("Hãy nhập câu trả lời: (phép tính đúng)/(phép tính sai) ");
        System.out.println(a + " + " + b + " = " + c);
        String str = sc.nextLine();

        System.out.println("-------------------------------------------------------");
        if(a + b == c && str.equals(DUNG)){
            System.out.println("Bạn trả lời đúng");
        } else if (a + b != c && str.equals(SAI)) {
            System.out.println("Bạn trả lời đúng");
        }else {
            System.out.println("Bạn trả lời sai");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        hienThi(sc);
    }

}
