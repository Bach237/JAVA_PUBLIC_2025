package Buoi6;

public class LopHoc {
    private String maLop, tenLop;

    public LopHoc(String tenLop, String maLop) {
        this.tenLop = tenLop;
        this.maLop = maLop;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void inThongTin() {
        System.out.println("Mã lớp: " + this.maLop);
        System.out.println("Tên lớp: " + this.tenLop);
    }

}
