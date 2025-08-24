package Buoi7.BTVN;

import java.util.Scanner;

public interface StudentManagerInterface {
    void importData(Scanner sc);
    void sortByScoreDesc();
    void sortByScoreAsc();
    Student findByName(String name);
    void printStudents();
}
