package Buoi5;

import java.util.ArrayList;

public class Cage {
    private String cageCode;
    private ArrayList<Pet> pets;
    private int currentPetCount;
    private static int totalCages;
    private final int MAX_CAPACITY = 3;

    public Cage(String cageCode, ArrayList<Pet> pets) {
        this.cageCode = cageCode;
        this.pets = pets;
        Cage.totalCages++;
    }

    public void addPet(Pet pet){
        if (currentPetCount < MAX_CAPACITY) {
            System.out.println("Thêm thành công vào chuồng " + this.cageCode);
            this.pets.add(pet);
            currentPetCount++;
        } else {
            System.out.println("Chuồng " + this.cageCode + " đã đầy, không thể thêm thú nữa!");
        }
    }

    public int getTotalCages(){
        return Cage.totalCages;
    }

    public void printAllPets(){
        System.out.println("Mã chuồng thứ: " + this.cageCode);
        for(Pet pet : pets){
            System.out.println(pet);
        }
    }
}
