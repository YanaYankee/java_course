package ru.stqa.pft.sandbox;


public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 2);

        System.out.println(
                "Distance between points p1 and p2 with coordinates (" + p1.x + ", " + p1.y +
                        ") and (" + p2.x + ", " + p2.y + ") equals " + p1.distance(p2));

        Point p3 = new Point(5, 6);
        Point p4 = new Point(3, 8);

        System.out.println(
                "Distance between p3 and p4 with coordinates (" + p3.x + ", " + p3.y +
                        ") and (" + p3.x + ", " + p3.y + ") equals " + p3.distance(p4));
        }
}
