package Buoi6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> arr = new ArrayList<>();
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("-----Nhập sinh viên " + (i + 1) + "-----");
            System.out.print("Nhập mã sinh viên: ");
            String maSV = sc.nextLine();
            System.out.print("Nhập tên sinh viên: ");
            String tenSV = sc.nextLine();
            System.out.print("Nhập điểm TB sinh viên: ");
            double diemTB = sc.nextDouble();
            sc.nextLine();
            System.out.print("Nhập tên lớp học: ");
            String maLop = sc.nextLine();
            System.out.print("Nhập mã lớp học: ");
            String tenLop = sc.nextLine();

            SinhVien sv = new SinhVien(maSV, tenSV, diemTB, new LopHoc(maLop, tenLop));
            arr.add(sv);
        }
            System.out.println("-----------------------------");


//        LopHoc lopA = new LopHoc("KTPM04", "2024DHKTPM04");
//        LopHoc lopB = new LopHoc("KHMT02", "2024DHKHMP02");
//        LopHoc lopC = new LopHoc("HTTT02", "2024DHHTTT01");
//
//
//        SinhVien svA = new SinhVien("2024611054", "Nguyen Duy Bach", 9, lopA);
//        SinhVien svB = new SinhVien("2024611048", "Nguyen Viet Hai", 8.5, lopA);
//        SinhVien svC = new SinhVien("2024611746", "Nguyen Tuyet Mai", 8.6, lopC);
//        SinhVien svD = new SinhVien("2024612345", "Nguyen Khanh Huyen", 9.5, lopC);
//        SinhVien svE = new SinhVien("2024611458", "Nguyen Dang Khoa", 8, lopB);
//        SinhVien svF = new SinhVien("2024612345", "Nguyen Tien Dat", 6.5, lopB);
//
//        arr.add(svA);
//        arr.add(svB);
//        arr.add(svC);
//        arr.add(svD);
//        arr.add(svE);
//        arr.add(svF);

        System.out.println("Sinh viên có điểm TB cao nhất");
        double maxTB = 0;
        int stt = 0;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).getDiemTB() > maxTB){
                maxTB = arr.get(i).getDiemTB();
                stt = i;
            }
        }
        arr.get(stt).inThongTin();
    }
}
