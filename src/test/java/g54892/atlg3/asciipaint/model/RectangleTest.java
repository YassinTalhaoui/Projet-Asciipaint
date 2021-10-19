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
 * Test of class Rectangle.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class RectangleTest {

    private Rectangle rectangle;

    /**
     * Called method before each test, it creates an instance of rectangle that
     * is used by each test.
     */
    @Before
    public void setUp() {
        this.rectangle = new Rectangle(new Point(2, 2), 5, 3, 'Y');
    }

    /**
     * Test of method move.
     */
    @Test
    public void testMove() {
        this.rectangle.move(1, 1);
        Point p = new Point(3, 3);
        assertEquals(this.rectangle.getUpperLeft().getX(), p.getX(), 0);
        assertEquals(this.rectangle.getUpperLeft().getY(), p.getY(), 0);
    }

    /**
     * Test of method isInside.
     */
    @Test
    public void testIsInside() {
        Point p = new Point(5, 0);
        assertEquals(true, this.rectangle.isInside(p));
    }

    /**
     * Test of method getColor.
     */
    @Test
    public void testGetColor() {
        assertEquals(this.rectangle.getColor(), 'Y');
    }
}
