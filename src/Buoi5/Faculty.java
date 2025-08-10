package Buoi5;

import java.util.Scanner;

public class Faculty {
    private String Name, Date;
    private School x;

    public Faculty(){

    }

    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public void Input(Scanner sc) {
        System.out.println("Nhap thong tin khoa: ");

        System.out.print("Nhap ten khoa: ");
        this.Name = sc.nextLine();

        System.out.print("Nhap ngay vao khoa: ");
        this.Date = sc.nextLine();

        x = new School();
        x.Input(sc);
    }

    public void Output() {
        System.out.println("Khoa: " + this.Name);
        System.out.println("Ngay vao khoa: " + this.Date);
        x.Output();
    }

    public String getName() {
        return this.Name;
    }

    public String getDate() {
        return this.Date;
    }

    public School getSchool() {
        return this.x;
    }
}
