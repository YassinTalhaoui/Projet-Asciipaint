/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;
 
/**
 * Interface that defines the behaviour that each form must have.
 *
 * @author Talhaoui Yassin - G54892
 */
public interface Shape {

    /**
     * Moves the given shape according to the horizontal and vertical variation.
     *
     * @param dx a double value, the horizontal variation.
     * @param dy a double value, the vertical variation.
     */
    void move(double dx, double dy);

    /**
     * Cheks that the given point is inside the shape.
     *
     * @param p a given point to check.
     * @return true if the point is inside, false otherwise.
     */
    boolean isInside(Point p);

    /**
     * Returns the character with which is coloured the shape.
     *
     * @return the pattern of the shape.
     */
    char getColor();
}
