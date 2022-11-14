package com.example.lab6;

public class Circle {
    private double radius;
    private double area;
    private double length;

    private static Circle instance;

    private Circle(){
    }

    public static Circle getInstance(){
        if (instance == null)
            instance = new Circle();
        return instance;
    }

    public void calsulate(){
        area = Math.PI * Math.pow(radius, 2);
        length = Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", length=" + length +
                '}';
    }
}
