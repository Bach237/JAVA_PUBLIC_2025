package Buoi7.BTVN;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class StudentManager implements StudentManagerInterface{
    private ArrayList<Student> students = new ArrayList<>();

    @Override
    public void importData(Scanner sc){
        System.out.print("Nhập số lượng học sinh: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            System.out.println("Học sinh thứ " + i);
            Student st = new Student();
            st.moreStudent(sc);
            students.add(st);
        }
    }

    @Override
    public void sortByScoreDesc() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o2.getScore(), o1.getScore());
            }
        });

        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }

    @Override
    public void sortByScoreAsc() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getScore(), o2.getScore());
            }
        });

        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }

    }

    @Override
    public Student findByName(String name) {
        for (Student s : students) {
            if (s.getName() != null && s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void printStudents() {
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i));
        }
    }
}
