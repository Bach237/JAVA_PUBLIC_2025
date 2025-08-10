package Buoi5;

import java.util.Arrays;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    QuanLy x;
    May[] y;
    Integer n;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich, QuanLy x, May[] y, Integer n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void Nhap(Scanner sc){
        System.out.println("--------Nhập thông tin phòng máy--------");

        System.out.print("Nhập mã phòng: ");
        this.maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        this.tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích căn phòng: ");
        this.dienTich = sc.nextDouble();
        sc.nextLine();

        this.x = new QuanLy();
        this.x.Nhap(sc);


        System.out.print("Nhập số lượng máy tính: ");
        this.n = sc.nextInt();
        sc.nextLine();

        this.y = new May[n];
        for(int i = 0; i < n; i++){
            System.out.println("----------Nhập thông tin máy thứ " + (i + 1) + "------------");
            this.y[i] = new May();
            this.y[i].Nhap(sc);
        }
        System.out.println("------------------------------------------------------");
    }

    public void Xuat(){
            System.out.println("-------------Phòng Máy-------------");
            System.out.println("Mã phòng: " + this.maPhong);
            System.out.println("Tên phòng: " + this.tenPhong);
            System.out.println("Diện tích phòng: " + this.dienTich);

            this.x.Xuat();
            System.out.println("Số lượng máy tính trong phòng: " + this.n);
            for(int i = 0; i < this.n; i++){
                System.out.println("-----------Máy thứ " + (i + 1) + "-------------");
                this.y[i].Xuat();
            }
            System.out.println("------------------------------------------");
    }

}
