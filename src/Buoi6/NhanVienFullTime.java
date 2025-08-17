package Buoi6;

public class NhanVienFullTime extends NhanVien{
    private double luongCoBan;
    private double tienThuong;

    public NhanVienFullTime(String maNV, String tenNV, int tuoi, String email, String soDienThoai, double luongCoBan, double tienThuong) {
        super(maNV, tenNV, tuoi, email, soDienThoai);
        this.luongCoBan = luongCoBan;
        this.tienThuong = tienThuong;
    }

    public double getTinhLuong() {
        return this.luongCoBan + this.tienThuong;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("------------Full Time------------");
        super.hienThiThongTin();
    }
}
