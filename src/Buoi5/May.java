package Buoi5;

import java.util.Scanner;

public class May {
    private String maMay, tenMay, tinhTrang;

    public May(){

    }

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public void Nhap(Scanner sc){
        System.out.print("Nhập mã máy: ");
        this.maMay = sc.nextLine();
        System.out.print("Nhập tên máy: ");
        this.tenMay = sc.nextLine();
        System.out.print("Nhập tình trạng máy: ");
        this.tinhTrang = sc.nextLine();

    }

    public void Xuat(){
        System.out.println("Mã máy: " + this.maMay);
        System.out.println("Tên máy: " + this.tenMay);
        System.out.println("Tình trạng máy: " + this.tinhTrang);

    }

}
