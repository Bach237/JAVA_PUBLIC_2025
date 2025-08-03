package Buoi4;

import java.util.Scanner;

public class Student {
    private String Ten, diaChi;
    private int namSinh, soTietNghi;
    private double tx1, tx2, KQHP;


    public Student(String Ten, int namSinh, String diaChi, double tx1, double tx2, double KQHP, int soTietNghi){
        this.Ten = Ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.KQHP = KQHP;
        this.soTietNghi = soTietNghi;
    }

    public void setSinhVien(String Ten, int namSinh, String diaChi, double tx1, double tx2, double KQHP, int soTietNghi){
        this.Ten = Ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tx1 = tx1;
        this.tx2 = tx2;
        this.KQHP = KQHP;
        this.soTietNghi = soTietNghi;
    }

    public int getTuoi(){
        return 2025 - this.namSinh;
    }

    public int getSoTietNghi(){
        return this.soTietNghi;
    }

    public double getGPA(){
        return (this.tx1 * 0.2 + this.tx2 * 0.3 + this.KQHP * 0.5);
    }

    public String toString(){
        return this.Ten + " " + this.getTuoi() + " " + this.diaChi + " " + this.tx1 + " " + this.tx2 + " " + this.KQHP + " " + this.getGPA() + " " + this.soTietNghi;
    }

}