package ru.stqa.pft.sandbox;

public class Point {
    // atributes
    public double x;
    public double y;

    // constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        double d = Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
        return d;
    }

}
