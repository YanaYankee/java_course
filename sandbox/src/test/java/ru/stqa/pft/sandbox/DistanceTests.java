package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {
    @Test
    public void testDistance() {
        Point p1 = new Point(1,3);
        Point p2 = new Point(5,3);

        Assert.assertEquals(p1.distance(p2), 4);
    }
    @Test
    public void testDistance2() {
        Point p1 = new Point(1,2);
        Point p2 = new Point(3,2);

        Assert.assertEquals(p1.distance(p2), 2);
    }

    @Test
    public void testDistance3() {
        Point p1 = new Point(2,4);
        Point p2 = new Point(4,5);

        Assert.assertEquals(Math.round(p1.distance(p2)*100.0)/100.0, 2.24);
    }
}

