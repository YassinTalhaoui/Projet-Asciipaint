/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;
 
/**
 * Represents a square.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class Square extends Rectangle {

    /**
     * Constructor of Square.
     *
     * @param upperLeft a Point that represet the upper right top of the square.
     * @param side the length of each side of the square, an Integer.
     * @param color a character with which the shape will be coloured
     */
    public Square(Point upperLeft, double side, char color) {
        super(upperLeft, side, side, color);
    }
}
