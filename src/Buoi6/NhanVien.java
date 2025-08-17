package Buoi6;

public class NhanVien {
    private String maNV;
    private String tenNV;
    private int tuoi;
    private String email;
    private String soDienThoai;

    public NhanVien(String maNV, String tenNV, int tuoi, String email, String soDienThoai) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoi = tuoi;
        this.email = email;
        this.soDienThoai = soDienThoai;
    }

    public double getTinhLuong() {
        return 0;
    }

    public void hienThiThongTin() {
        System.out.println("Mã nhân viên: " + this.maNV);
        System.out.println("Tên nhân viên: " + this.tenNV);
        System.out.println("Tuổi: " + this.tuoi);
        System.out.println("Email: " + this.email);
        System.out.println("Số điện thoại: " + this.soDienThoai);
        System.out.println("Lương nhân viên: " + this.getTinhLuong());
    }
}
