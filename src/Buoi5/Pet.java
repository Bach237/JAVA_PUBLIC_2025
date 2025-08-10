package Buoi5;

public class Pet {
    private String ten;
    private double canNang;
    private String loai;

    public Pet(String ten, double canNang, String loai) {
        this.ten = ten;
        this.canNang = canNang;
        this.loai = loai;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "ten='" + ten + '\'' +
                ", canNang=" + canNang +
                ", loai='" + loai + '\'' +
                '}';
    }

    public boolean getcheckcanNang(){
        if(this.canNang > 10) return true;
        else    return false;
    }

    public String getBasicInfo(){
        return this.ten + " " + this.loai;
    }

}
