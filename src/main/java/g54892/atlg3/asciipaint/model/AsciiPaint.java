/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.model;

/**
 * This is clas will act as a printer and print out the different shapes in
 * drawing zone.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class AsciiPaint {

    private Drawing drawing;

    /**
     * Constructor of AsciiPaint.
     */
    public AsciiPaint() {
        this.drawing = new Drawing(50, 50);
    }

    /**
     * Constructor of AsciiPaint.
     *
     * @param width, an Integer
     * @param height, an Integer.
     */
    public AsciiPaint(int width, int height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Invalid length or width "
                    + width + " " + height);
        }
        this.drawing = new Drawing(width, height);
    }

    /**
     * Simple getter of drawing.
     *
     * @return drawing.
     */
    public Drawing getDrawing() {
        return this.drawing;
    }

    /**
     * Adds a new circle to the drawing.
     *
     * @param x, an Integer.
     * @param y, an Integer.
     * @param radius, the radius of the circle (Integer).
     * @param color a given char, the color.
     */
    public void newCircle(int x, int y, int radius, char color) {
        this.drawing.addShape(new Circle(new Point(x, y), radius, color));
    }

    /**
     * Adds a new rectangle to the drawing.
     *
     * @param x, an Integer.
     * @param y, an Integer.
     * @param width, a double value
     * @param height, a double value.
     * @param color a given char, the color.
     */
    public void newRectangle(int x, int y, double width, double height,
            char color) {
        this.drawing.addShape(new Rectangle(new Point(x, y), width, height,
                color));
    }

    /**
     * Adds a new square to the drawing.
     *
     * @param x an Integer.
     * @param y an Integer.
     * @param side a double value that represents the lenght for the all sides.
     * @param color a given char, the color.
     */
    public void newSquare(int x, int y, double side, char color) {
        this.drawing.addShape(new Square(new Point(side, side), side, color));
    }

    /**
     * Prints the drawing and the shapes that the user has added.
     *
     * @return the drawing thzt contains the given shapes.
     */
    public String asAscii() {
        String str = "";
        Point p;
        for (int i = 0; i < this.drawing.getHeight(); i++) {
            for (int j = 0; j < this.drawing.getWidth(); j++) {
                p = new Point(i, j);
                if (this.drawing.getShapeAt(p).isInside(p)) {
                    p.setColor(this.drawing.getShapeAt(p).getColor());
                } else {
                    p.setColor(this.drawing.getColor());
                }
                str += "\033[41;38;10m" + p.getColor();
            }
            str += "\n";
        }
        return str;
    }
}
