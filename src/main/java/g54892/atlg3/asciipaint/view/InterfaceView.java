/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.view;
 
/**
 * Interface that is implemented by the view.
 *
 * @author Talhaoui Yassin - G54892
 */
public interface InterfaceView {

    /**
     * Prints a title for the game.
     */
    void displayTitle();

    /**
     * Asks the user to enter a command line.
     */
    void displayCommandLine();

    /**
     * Asks the user to chose a shape to display.
     */
    void chooseShape();

    /**
     * Asks a message that asks the user if he wants to add an other shape.
     */
    void oneMoreShape();

    /**
     * Displays the drawing.
     *
     * @param drawing a String that conatains the drawing to display.
     */
    void displayDrawing(String drawing);
}
