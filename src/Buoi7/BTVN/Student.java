package Buoi7.BTVN;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private double score;
    private int age;
    private String email;
    private String className;
    private String address;

    public Student(){

    }

    public Student(String id, String name, double score, int age, String email, String className, String address) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.age = age;
        this.email = email;
        this.className = className;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGrade(){
        if(this.score >= 8) {
            return 'A';
        }
        else if (this.score >= 6 && this.score < 8) {
            return 'B';
        } else if (this.score >= 4 && this.score < 6) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public void moreStudent(Scanner sc){
        System.out.print("Nhập id: ");
        this.id = sc.nextLine();
        System.out.print("Nhập name: ");
        this.name = sc.nextLine();
        System.out.print("Nhập score: ");
        this.score = sc.nextDouble();
        System.out.print("Nhập age: ");
        this.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập email: ");
        this.email = sc.nextLine();
        System.out.print("Nhập className: ");
        this.className = sc.nextLine();
        System.out.print("Nhập address: ");
        this.address = sc.nextLine();
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + age + " | " + email + " | " + className + " | " + address + " | " + score + " | " + getGrade();
    }
}
