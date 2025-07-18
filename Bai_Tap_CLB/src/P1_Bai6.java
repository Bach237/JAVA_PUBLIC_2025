import java.util.Scanner;

// Class Student
class Student {
    String name;
    int age;
    double gpa;

    // Constructor
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    // In thông tin sinh viên
    public void display() {
        System.out.println("Tên: " + name + ", Tuổi: " + age + ", GPA: " + gpa);
    }
}

// Class chính
public class P1_Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số lượng sinh viên
        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        // Nhập thông tin từng sinh viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            System.out.print("Tên: ");
            String name = sc.nextLine();
            System.out.print("Tuổi: ");
            int age = sc.nextInt();
            System.out.print("GPA: ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            students[i] = new Student(name, age, gpa);
        }

        // In danh sách sinh viên
        System.out.println("\n--- Danh sách sinh viên ---");
        for (Student s : students) {
            s.display();
        }

        // Tính GPA trung bình
        double sum = 0;
        for (Student s : students) {
            sum += s.gpa;
        }
        double avgGpa = sum / n;
        System.out.println("\nĐiểm trung bình cả lớp: " + avgGpa);

        // Tìm sinh viên có GPA cao nhất
        Student maxGpaStudent = students[0];
        for (Student s : students) {
            if (s.gpa > maxGpaStudent.gpa) {
                maxGpaStudent = s;
            }
        }

        System.out.println("\nSinh viên có GPA cao nhất:");
        maxGpaStudent.display();
    }
}
