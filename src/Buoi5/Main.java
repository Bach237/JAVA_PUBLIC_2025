package Buoi5;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //tao chuong
        Cage chuong1 = new Cage("01", new ArrayList<>());
        Cage chuong2 = new Cage("02", new ArrayList<>());


        //tao pet
        Pet pet1 = new Pet("Milu", 5.5, "Chó");
        Pet pet2 = new Pet("Tom", 3.2, "Mèo");
        Pet pet3 = new Pet("Rio", 12.0, "Chim");
        Pet pet4 = new Pet("Nami", 6, "Ca");
        // Thêm thú vào chuồng
        chuong1.addPet(pet1);
        chuong1.addPet(pet2);
        chuong1.addPet(pet3);
        chuong1.addPet(pet3);


        chuong2.addPet(pet4);

        // in
        System.out.println("Số lồng đã tạo là: " + chuong1.getTotalCages());
        chuong1.printAllPets();
        chuong2.printAllPets();
    }
}


