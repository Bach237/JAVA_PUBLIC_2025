package Buoi7.BT;


import java.util.InputMismatchException;
import java.util.Scanner;


public class ThanhToan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap tuoi: ");
        try{
            int age = sc.nextInt();
            System.out.println("Tuoi cua ban la: " + age);
        } catch (Exception ex){
            System.out.println("nhap khong hop le");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("tao dang chay");
        }

        System.out.println("Chuong trinh ket thuc");

    }
}
