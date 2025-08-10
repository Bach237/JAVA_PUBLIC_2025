package Buoi5;

import java.util.Scanner;

public class School {
    private String Name, Date;

    public School(){

    }

    public School(String Name, String Date) {
        this.Name = Name;
        this.Date = Date;
    }

    public void Input(Scanner sc){
        System.out.println("Nhap thong tin truong: ");

        System.out.print("Nhap ten truong: ");
        String tenTruong = sc.nextLine();

        System.out.print("Nhap ngay vao truong: ");
        String dateTruong = sc.nextLine();

        this.Name = tenTruong;
        this.Date = dateTruong;
    }

    public void Output() {
        System.out.println("Truong: " + this.getName());
        System.out.println("Ngay vao truong: " + this.getDate());
        System.out.println("----------------------------------");
    }

    public String getName() {
        return this.Name;
    }

    public String getDate() {
        return this.Date;
    }


}
