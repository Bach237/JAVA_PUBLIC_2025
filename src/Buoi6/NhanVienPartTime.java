package Buoi6;

public class NhanVienPartTime extends NhanVien{
    private int soGioLam;
    private double luongTheoGio;

    public NhanVienPartTime(String maNV, String tenNV, int tuoi, String email, String soDienThoai, int soGioLam, double luongTheoGio) {
        super(maNV, tenNV, tuoi, email, soDienThoai);
        this.soGioLam = soGioLam;
        this.luongTheoGio = luongTheoGio;
    }

    public double getTinhLuong() {
        return this.soGioLam * this.luongTheoGio;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("------------Part Time------------");
        super.hienThiThongTin();
    }
}
