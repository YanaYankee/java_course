package ru.stqa.pft.sandbox;

import static ru.stqa.pft.sandbox.Point.distance;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 2);

        System.out.println(
                "Distance between points p1 and p2 with coordinates (" + p1.x + ", " + p1.y +
                        ") and (" + p2.x + ", " + p2.y + ") equals " + distance(p1, p2));

        Point p3 = new Point(5, 6);
        Point p4 = new Point(3, 8);

        System.out.println(
                "Distance between p3 and p4 with coordinates (" + p3.x + ", " + p3.y +
                        ") and (" + p3.x + ", " + p3.y + ") equals " + distance(p3, p4));
        }

}
