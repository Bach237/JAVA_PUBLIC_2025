package Buoi5;

import java.util.Scanner;

public class QuanLy {
    private String maQL, hoTen;

    public QuanLy(){

    }

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public void Nhap(Scanner sc){
        System.out.println("-------------Nhập thông tin quản lý-------------");
        System.out.print("Nhập mã quản lý: ");
        this.maQL = sc.nextLine();
        System.out.print("Nhập họ tên quản lý: ");
        this.hoTen = sc.nextLine();

    }

    public void Xuat(){
        System.out.println("-------------Quản Lý-------------");
        System.out.println("Ma quan ly: " + this.maQL);
        System.out.println("Ten quan ly: " + this.hoTen);
        System.out.println("---------------------------------");
    }

}
