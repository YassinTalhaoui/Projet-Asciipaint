/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test of the class Point.
 *
 * @author Talhoaui Yassin - G54892.
 */
public class PointTest {

    private Point point;

    /**
     * Called method before each test, it creates an instance of point that is
     * used by each test.
     */
    @Before
    public void setUp() {
        this.point = new Point(0, 0);
    }

    /**
     * Test of the method move.
     */
    @Test
    public void testMove() {
        this.point.move(1, 1);
        Point p = new Point(1, 1);
        assertEquals(this.point.getX(), p.getX(), 0);
        assertEquals(this.point.getY(), p.getY(), 0);
    }

    /**
     * Test of the method distanceTo.
     */
    @Test
    public void testDistanceTo() {
        Point p = new Point(1, 2);
        assertEquals(2.23606797749979, this.point.distanceTo(p), 0);
    }
}
