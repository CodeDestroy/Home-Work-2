package ru.dataart.academy.java.figures;

public class Cirlce extends Figure{
    private  double radius;
    final double pi = 3.1415;
    public Cirlce (double radius) {
        this.radius = radius;
    }
    public Cirlce () {}
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return  radius;
    }

    @Override
    public double findArea() {
        return pi*radius*radius;
    }

    @Override
    public double findPerimetr() {
        return 2*radius*pi;
    }
}
