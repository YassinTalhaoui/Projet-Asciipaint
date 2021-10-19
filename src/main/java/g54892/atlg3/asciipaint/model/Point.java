/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;
 
/**
 * Represents a point.
 *
 * @author Talhaoui Yassin - G54892
 */
public class Point {

    private double x;
    private double y;
    private char color;

    /**
     * Constructor of Point.
     *
     * @param x the x-coordinate of the point, a double value.
     * @param y the y-coordinate of the point, a double value.
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Constructor of Point.
     *
     * @param p a given point.
     */
    public Point(Point p) {
        p = new Point(this.x, this.y);
    }

    /**
     * Moves the point according to the given variations.
     *
     * @param dx the horizontal variation, a double value.
     * @param dy the vertical variation, a double value.
     * @return the point whith it's new coordinates.
     */
    public Point move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
        return this;
    }

    /**
     * Simple getter of x.
     *
     * @return x, a double value.
     */
    public double getX() {
        return this.x;
    }

    /**
     * Simple getter of y.
     *
     * @return y, a double value.
     */
    public double getY() {
        return this.y;
    }

    /**
     * Simple getter of color
     *
     * @return color, the pattern of the point char.
     */
    public char getColor() {
        return this.color;
    }

    /**
     * Simple setter of color
     *
     * @param color the new color, char.
     */
    public void setColor(char color) {
        this.color = color;
    }

    /**
     * Calculates the distance between 2 points.
     *
     * @param other a given point.
     * @return the distance that separates the 2 points.
     */
    double distanceTo(Point other) {
        return Math.sqrt(Math.pow((other.getY() - this.getY()), 2)
                + Math.pow((other.getX() - this.getX()), 2));
    }
}
