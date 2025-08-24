package Buoi7.BTVN;

import java.util.Scanner;

public class Main {

    public static void function(){
        System.out.println("===== QUẢN LÝ HỌC SINH =====");
        System.out.println("1. In danh sách học sinh");
        System.out.println("2. Sắp xếp theo điểm giảm dần");
        System.out.println("3. Sắp xếp theo điểm tăng dần");
        System.out.println("4. Tìm học sinh theo tên");
        System.out.println("5. Thoát");
        System.out.print("Chọn chức năng: ");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            StudentManagerInterface studentManager = new StudentManager();
            studentManager.importData(sc);

            int enter;
            do {
                function();
                enter = sc.nextInt();
                if (enter == 1) {
                    System.out.println("----------------- Danh sách học sinh -----------------");
                    studentManager.printStudents();
                    System.out.println("------------------------------------------------------");

                } else if (enter == 2) {
                    System.out.println("-------- Danh sách học sinh có score giảm dần --------");
                    studentManager.sortByScoreDesc();
                    System.out.println("------------------------------------------------------");

                } else if (enter == 3) {
                    System.out.println("-------- Danh sách học sinh có score tăng dần --------");
                    studentManager.sortByScoreAsc();
                    System.out.println("------------------------------------------------------");

                } else if (enter == 4) {
                    System.out.print("\nNhập tên cần tìm: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.println(studentManager.findByName(name));
                    System.out.println("------------------------------------------------------");

                }
            } while (enter != 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Chương trình kết thúc!");
    }
}
