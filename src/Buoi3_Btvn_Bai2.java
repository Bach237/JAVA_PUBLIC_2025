import java.util.Scanner;

public class Buoi3_Btvn_Bai2 {
    public static String daoChuoi(String str){
        String strNew = "";
        for(int i = str.length() - 1; i >= 0; i--){
            strNew += str.charAt(i);
        }
        return  strNew;
    }

    public static boolean checkDoiXung(String str){
        if(str.equals(daoChuoi(str))) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hãy nhập vào 1 chuỗi: ");
        String str = sc.nextLine();

        if(checkDoiXung(str)){
            String upperStr = str.toUpperCase();
            System.out.print(upperStr + "\n");
            System.out.println("Chuỗi này đối xứng");
        }else{
            String lowerStr = str.toLowerCase();
            System.out.print(lowerStr + "\n");
            System.out.println("Chuỗi này không đối xứng");
        }
    }
}
