package Buoi7.BT;

public class Rectangle extends Shape{
    private double dai, rong;

    public Rectangle(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(int dai) {
        this.dai = dai;
    }

    @Override
    public double area() {
        return this.dai * this.rong;
    }


}
