package Buoi6;

import java.util.ArrayList;

public class QuanLyNhanVien {
    ArrayList<NhanVien> danhSachNhanVien = new ArrayList<>();

    public void themNhanVien(NhanVien nv){
        danhSachNhanVien.add(nv);
    }

    public  void hienThiTatCa(){
        for(NhanVien x : danhSachNhanVien){
            x.hienThiThongTin();
        }
        System.out.println("----------------------------------");
    }

    public double tinhTongLuong(){
        double sum = 0;
        for(NhanVien x : danhSachNhanVien){
            sum += x.getTinhLuong();
        }
        System.out.print("Tổng qũy lương: ");
        return sum;
    }

}
