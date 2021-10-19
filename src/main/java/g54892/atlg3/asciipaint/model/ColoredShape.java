/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;

/**
 * Represents that shape that is colored by a given pattern.
 *
 * @author Talhaoui Yassin - G54892.
 */
public abstract class ColoredShape implements Shape {

    private char color;

    /**
     * Constructor of ColoredShape.
     *
     * @param color the color of the shape, char.
     */
    public ColoredShape(char color) {
        this.color = color;
    }

    /**
     * Simple getter of color.
     *
     * @return the color of the shape.
     */
    public char getColor() {
        return color;
    }

    /**
     * Simple setter of color.
     *
     * @param color the new color to set.
     */
    public void setColor(char color) {
        this.color = color;
    }
}
 