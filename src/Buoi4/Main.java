package Buoi4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arr = new ArrayList<>();
        int choice;
        do {
            Menu.hienThiMenu();
            choice = sc.nextInt();
            sc.nextLine(); // bỏ ký tự Enter thừa

            switch (choice) {
                case 1:
                    // gọi hàm thêm sinh viên
                    System.out.println("Nhập thông tin sinh viên:");
                    String ten = sc.nextLine();
                    int ns = sc.nextInt(); sc.nextLine();
                    String diaChi = sc.nextLine();
                    double tx1 = sc.nextDouble();
                    double tx2 = sc.nextDouble();
                    double kqhp = sc.nextDouble();
                    int tietNghi = sc.nextInt(); sc.nextLine();

                    Student SV = new Student(ten, ns, diaChi, tx1, tx2, kqhp, tietNghi);
                    arr.add(SV);
                    break;
                case 2:
                    // gọi hàm sửa sinh viên
                    System.out.print("Nhập tên sinh viên cần sửa: ");
                    String tenSua = sc.nextLine();
                    boolean timThay = false;

                    for (Student s : arr) {
                        if (s.toString().contains(tenSua)) {
                            timThay = true;
                            System.out.println("Nhập thông tin mới:");
                            String tenMoi = sc.nextLine();
                            int nsMoi = sc.nextInt(); sc.nextLine();
                            String diaChiMoi = sc.nextLine();
                            double tx1Moi = sc.nextDouble();
                            double tx2Moi = sc.nextDouble();
                            double kqhpMoi = sc.nextDouble();
                            int tietNghiMoi = sc.nextInt();
                            sc.nextLine();

                            s.setSinhVien(tenMoi, nsMoi, diaChiMoi, tx1Moi, tx2Moi, kqhpMoi, tietNghiMoi);
                            System.out.println("Đã cập nhật thông tin.");
                            break;
                        }
                    }
                    if (!timThay) System.out.println("Không tìm thấy sinh viên.");
                    break;
                case 3:
                    // sắp xếp theo tuổi
                    Collections.sort(arr, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getTuoi() - o2.getTuoi();
                        }
                    });

                    for (Student x : arr){
                        System.out.println(x);
                    }
                    break;
                case 4:
                    // sắp xếp theo GPA
                    Collections.sort(arr, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return (int)o1.getGPA() - (int)o2.getGPA();
                        }
                    });

                    for (Student x : arr){
                        System.out.println(x);
                    }
                    break;
                case 5:
                    // sắp xếp theo tiết nghỉ
                    Collections.sort(arr, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getSoTietNghi() - o2.getSoTietNghi();
                        }
                    });

                    for (Student x : arr){
                        System.out.println(x);
                    }
                    break;
                case 6:
                    // xóa sinh viên
                    System.out.print("Nhập tên sinh viên cần xóa: ");
                    String tenXoa = sc.nextLine();
                    boolean daXoa = arr.removeIf(s -> s.toString().contains(tenXoa));
                    if (daXoa) {
                        System.out.println("Đã xóa sinh viên.");
                    } else {
                        System.out.println("Không tìm thấy sinh viên để xóa.");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);
    }
}
