package Buoi6;


import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        QuanLyNhanVien quanLy = new QuanLyNhanVien();
//
//        System.out.print("Nhap so luong nhan vien Full Time: ");
//        int n = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            sc.nextLine();
//            System.out.println("NV Full Time " + i);
//            System.out.print("Nhập mã NV: ");
//            String maNV = sc.nextLine();
//            System.out.print("Nhập tên NV: ");
//            String tenNV = sc.nextLine();
//            System.out.print("Nhập tuổi: ");
//            int tuoi = sc.nextInt();
//            sc.nextLine();
//            System.out.print("Nhập email: ");
//            String email = sc.nextLine();
//            System.out.print("Nhập số điện thoại: ");
//            String soDT = sc.nextLine();
//            System.out.print("Nhập lương cơ bản: ");
//            double luongCB = sc.nextDouble();
//            System.out.print("Nhập tiền thưởng: ");
//            double tienThuong = sc.nextDouble();
//
//            NhanVienFullTime nv = new NhanVienFullTime(maNV, tenNV, tuoi, email, soDT, luongCB, tienThuong);
//            quanLy.themNhanVien(nv);
//        }
//
//        System.out.print("Nhap so luong nhan vien Part Time: ");
//        int m = sc.nextInt();
//        for(int i = 1; i <= n; i++){
//            sc.nextLine();
//            System.out.println("NV Part Time " + i);
//            System.out.print("Nhập mã NV: ");
//            String maNV = sc.nextLine();
//            System.out.print("Nhập tên NV: ");
//            String tenNV = sc.nextLine();
//            System.out.print("Nhập tuổi: ");
//            int tuoi = sc.nextInt();
//            sc.nextLine();
//            System.out.print("Nhập email: ");
//            String email = sc.nextLine();
//            System.out.print("Nhập số điện thoại: ");
//            String soDT = sc.nextLine();
//            System.out.print("Nhập số giờ làm: ");
//            int soGioLam = sc.nextInt();
//            System.out.print("Nhập lương theo giờ: ");
//            double luongTheoGio = sc.nextDouble();
//
//            NhanVienPartTime nv = new NhanVienPartTime(maNV, tenNV, tuoi, email, soDT, soGioLam, luongTheoGio);
//            quanLy.themNhanVien(nv);
//        }



        NhanVienFullTime nvf1 = new NhanVienFullTime("NVFT01", "Nguyen Duy Bach", 19, "ndbach669@gmail.com", "0832488669", 6500, 500);
        NhanVienFullTime nvf2 = new NhanVienFullTime("NVFT02", "Nguyen Viet hai", 19, "nvhai123@gmail.com", "0123456789", 6500, 300);

        NhanVienPartTime nvp1 = new NhanVienPartTime("NVPT01", "Nguyen Khanh Huyen", 19, "khanhhuyen68@gmail.com", "0987654321", 24, 30);
        NhanVienPartTime nvp2 = new NhanVienPartTime("NVPT01", "Le Duy Manh", 20, "manhle123@gmail.com", "0987612345", 30, 30);

        QuanLyNhanVien quanLy = new QuanLyNhanVien();
        quanLy.themNhanVien(nvf1);
        quanLy.themNhanVien(nvf2);
        quanLy.themNhanVien(nvp1);
        quanLy.themNhanVien(nvp2);



        quanLy.hienThiTatCa();

        System.out.println(quanLy.tinhTongLuong());
    }
}
