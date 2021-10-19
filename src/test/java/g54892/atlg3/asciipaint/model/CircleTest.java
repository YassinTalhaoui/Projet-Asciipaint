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
 * Test of class Circle.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class CircleTest {

    private Circle circle;

    /**
     * Called method before each test, it creates an instance of circle that is
     * used by each test.
     */
    @Before
    public void setUp() {
        this.circle = new Circle(new Point(2, 1), 3, 'Y');
    }

    /**
     * Test of method move.
     */
    @Test
    public void testMove() {
        this.circle.move(1, 1);
        Point p = new Point(3, 2);
        assertEquals(this.circle.getCenter().getX(), p.getX(), 0);
        assertEquals(this.circle.getCenter().getY(), p.getY(), 0);
    }

    /**
     * Test of method isInside.
     */
    @Test
    public void testIsInside() {
        Point p = new Point(4, 2);
        assertEquals(true, this.circle.isInside(p));
    }

    /**
     * Test of method getColor.
     */
    @Test
    public void testGetColor() {
        assertEquals(this.circle.getColor(), 'Y');
    }
}
