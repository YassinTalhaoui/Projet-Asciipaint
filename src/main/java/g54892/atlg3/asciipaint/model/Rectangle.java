/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;

/**
 * Represents a rectangle.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class Rectangle extends ColoredShape {

    private Point upperLeft;
    private double width;
    private double height;

    /**
     * Constructor of Rectangle.
     *
     * @param upperLeft, Point that represents the upper right top.
     * @param height the height of the rectangle represented by a double value.
     * @param width the width of the rectangle represented by a double value.
     * @param color, the pattern of the rectangle (char).
     */
    public Rectangle(Point upperLeft, double width, double height, char color) {
        super(color);
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid length or width "
                    + width + " " + height);
        }
        this.upperLeft = upperLeft;
        this.width = width;
        this.height = height;
    }

    /**
     * Simple getter of upperLeft.
     *
     * @return uppeerLeft, a Point.
     */
    public Point getUpperLeft() {
        return this.upperLeft;
    }

    /**
     * Simple getter of width.
     *
     * @return width, a double value.
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Simple getter of height.
     *
     * @return height, a double value.
     */
    public double getHeight() {
        return this.height;
    }

    /**
     * Moves the given shape according to the horizontal and vertical variation.
     *
     * @param dx a double value, the horizontal variation.
     * @param dy a double value, the vertical variation.
     */
    @Override
    public void move(double dx, double dy) {
        this.upperLeft.move(dx, dy);
    }

    /**
     * Cheks that the given point is inside the shape.
     *
     * @param p a given point to check.
     * @return true if the point is inside, false otherwise.
     */
    @Override
    public boolean isInside(Point p) {
        return p.getX() >= this.upperLeft.getX()
                && p.getX() <= this.upperRight().getX()
                && p.getX() > this.bottomLeft().getX()
                && p.getX() <= this.bottomRight().getX()
                && p.getY() >= this.bottomLeft().getY()
                && p.getY() >= this.bottomRight().getY()
                && p.getY() <= this.upperLeft.getY()
                && p.getY() < this.upperRight().getY();
    }

    /**
     * Private method that calculates the upperRight top of the rectangle.
     *
     * @return the upperRight top, Point.
     */
    private Point upperRight() {
        return new Point(this.upperLeft.getX() + this.width,
                this.upperLeft.getY());
    }

    /**
     * Private method that calculates the bottomLeft top of the rectangle.
     *
     * @return the bottomLeft top, Point.
     */
    private Point bottomLeft() {
        return new Point(this.upperLeft.getX(), this.upperLeft.getY()
                - this.height);
    }

    /**
     * Private method that calculates the bottomRight top of the rectangle.
     *
     * @return the bottomRight top, Point.
     */
    private Point bottomRight() {
        return new Point(this.upperLeft.getX() + this.width,
                this.upperLeft.getY() - this.height);
    }

    /**
     * Returns the character with which is coloured the shape.
     *
     * @return the pattern of the shape.
     */
    @Override
    public char getColor() {
        return super.getColor();
    }
}
