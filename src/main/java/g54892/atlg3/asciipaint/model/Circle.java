/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;
 
/**
 * Represents a circle.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class Circle extends ColoredShape {

    private Point center;
    private double radius;

    /**
     * Constructor of Cicle.
     *
     * @param center Point, the center of the circle.
     * @param radius an Integer, the radius of the circle.
     * @param color char, the color of the circle.
     */
    public Circle(Point center, double radius, char color) {
        super(color);
        if (radius <= 0) {
            throw new IllegalArgumentException("Invalid radius.");
        }
        this.center = center;
        this.radius = radius;
    }

    /**
     * Simple getter of center.
     *
     * @return center Point, the centre of the cicle
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * Simple getter of radius.
     *
     * @return an Integer, the radius.
     */
    public double getRadius() {
        return this.radius;
    }

    /**
     * Moves the given shape according to the horizontal and vertical variation.
     *
     * @param dx a double value, the horizontal variation.
     * @param dy a double value, the vertical variation.
     */
    @Override
    public void move(double dx, double dy) {
        this.center.move(dx, dy);
    }

    /**
     * Cheks that the given point is inside the shape.
     *
     * @param p a given point to check.
     * @return true if the point is inside, false otherwise.
     */
    @Override
    public boolean isInside(Point p) {
        return p.distanceTo(this.center) < this.radius;
    }

    /**
     * Simple getter of color.
     *
     * @return the color of the shape.
     */
    @Override
    public char getColor() {
        return super.getColor();
    }
}
