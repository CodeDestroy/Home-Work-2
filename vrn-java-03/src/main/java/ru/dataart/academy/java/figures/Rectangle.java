package ru.dataart.academy.java.figures;

public class Rectangle extends Figure {
    private double aside, bside;
    public Rectangle(double aside, double bside) {
        this.aside = aside;
        this.bside = bside;
    }
    public Rectangle(double aside) {
        this.aside = aside;
        this.bside = aside;
    }
    public Rectangle() {}
    public void setSides(double aside, double bside) {
        this.aside = aside;
        this.bside = bside;
    }
    public double getAside(){
        return aside;
    }
    public double getBside(){
        return bside;
    }
    @Override
    public double findArea() {
        return aside * bside;
    }

    @Override
    public double findPerimetr() {
        return 2*(aside + bside);
    }
}
