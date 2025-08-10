package Buoi5;

import java.util.Scanner;

public class Student {
    private String Name, Class;
    private double Score;
    private Faculty y;

    public Student(){

    }

    public Student(String name, String aClass, double score, Faculty y) {
        Name = name;
        Class = aClass;
        Score = score;
        this.y = y;
    }

    public void Input(Scanner sc){
        System.out.println("Nhap thong tin hoc sinh: ");

        System.out.print("Nhap ten hoc sinh: ");
        this.Name = sc.nextLine();

        System.out.print("Nhap lop: ");
        this.Class = sc.nextLine();

        System.out.print("Nhap diem: ");
        this.Score = sc.nextDouble();

        sc.nextLine(); // clear buffer

        y = new Faculty();
        y.Input(sc);
    }


    public void Output() {
        System.out.println("Ten hoc sinh: " + this.Name);
        System.out.println("Lop: " + this.Class);
        System.out.println("Diem: " + this.Score);
        y.Output();
    }

    public String getName() {
        return this.Name;
    }

    public String getLop() {
        return this.Class;
    }

    public double getScore() {
        return this.Score;
    }
}
