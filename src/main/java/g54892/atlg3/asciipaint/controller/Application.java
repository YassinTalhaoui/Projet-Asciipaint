/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.controller;

import g54892.atlg3.asciipaint.model.*;
import g54892.atlg3.asciipaint.view.View;
import java.util.Scanner;

/**
 * The contoller of the application asciiPaint.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class Application {

    AsciiPaint paint;
    View view = new View();
    Scanner kbd;

    /**
     * Constructor of Application.
     */
    public Application() {
        this.kbd = new Scanner(System.in);
    }

    /**
     * Starts the application.
     */
    public void start() {
        this.view.displayTitle();
        this.paint = new AsciiPaint();
        this.view.displayDrawing(this.paint.asAscii());
        this.view.oneMoreShape();
        while (this.kbd.nextLine().equals("yes")) {
            this.view.chooseShape();
            String shape = this.kbd.nextLine();
            switch (shape) {
                case "circle":
                    circle();
                    break;
                case "rectangle":
                    rectangle();
                    break;
                case "square":
                    square();
                    break;
                default:
                    break;
            }
            this.view.oneMoreShape();
            this.kbd.nextLine();
        }
    }

    /**
     * Adds and prints a rectangle with the given dimensions.
     */
    private void rectangle() {
        this.view.displayCommandLine();
        int x = this.kbd.nextInt();
        int y = this.kbd.nextInt();
        double height = this.kbd.nextDouble();
        double width = this.kbd.nextDouble();
        this.paint.newRectangle(y, x, width, height, 'R');
        this.view.displayDrawing(this.paint.asAscii());
    }

    /**
     * Adds and prints a square with the given dimensions.
     */
    private void square() {
        this.view.displayCommandLine();
        int y = this.kbd.nextInt();
        int x = this.kbd.nextInt();
        double side = this.kbd.nextDouble();
        this.paint.newRectangle(x, y, side, side, 'S');
        this.view.displayDrawing(this.paint.asAscii());
    }

    /**
     * Adds and prints a circle with the given dimensions.
     */
    private void circle() {
        this.view.displayCommandLine();
        int y = this.kbd.nextInt();
        int x = this.kbd.nextInt();
        int radius = this.kbd.nextInt();
        this.paint.newCircle(x, y, radius, 'C');
        this.view.displayDrawing(this.paint.asAscii());
    }
}
