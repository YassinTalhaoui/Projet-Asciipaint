/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;

import java.util.ArrayList;
import java.util.List;
 
/**
 * Represents the drawing zone that will contain all the added shapes.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class Drawing implements Shape {

    private List<Shape> shapes;
    private final int height;
    private final int width;
    private char color;

    /**
     * Constructor of Drawing .
     *
     * @param width the width of the drawing, an Integer.
     * @param height the height of the drawing, an Integer.
     */
    public Drawing(int width, int height) {
        this.width = width;
        this.height = height;
        this.shapes = new ArrayList<>();
        this.color = ' ';
    }

    /**
     * Simple getter of height.
     *
     * @return the height of the drawing.
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Simple getter of width.
     *
     * @return the width of the drawing.
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Simple getter of shapes.
     *
     * @return an array that contains all the shapes that have been added.
     */
    public List<Shape> getShapes() {
        return this.shapes;
    }

    /**
     * Adds a shape in the drawing area.
     *
     * @param shape a given shape to add in the drawing area.
     */
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * Simple getter of color.
     *
     * @return color, the pattens of the drawing.
     */
    public char getColor() {
        return this.color;
    }

    /**
     * Simple setter of color.
     *
     * @param color the pattern to set, char.
     */
    public void setColor(char color) {
        this.color = color;
    }

    /**
     * Gives the shapes that contains the given point.
     *
     * @param p a given Point.
     * @return the shape.
     */
    public Shape getShapeAt(Point p) {
        for (Shape s : this.shapes) {
            if (s.isInside(p)) {
                return s;
            }
        }
        return this;
    }

    /**
     * Moves the given shape according to the horizontal and vertical variation.
     *
     * @param dx a double value, the horizontal variation.
     * @param dy a double value, the vertical variation.
     */
    @Override
    public void move(double dx, double dy) {
        System.out.println("The drawing cannot be moved.");
    }

    /**
     * Cheks that the given point is inside the shape.
     *
     * @param p a given point to check.
     * @return true if the point is inside, false otherwise.
     */
    @Override
    public boolean isInside(Point p) {
        return p.getX() <= this.width && p.getX() >= 0 && p.getY() <= this.width
                && p.getY() >= 0;
    }
}
