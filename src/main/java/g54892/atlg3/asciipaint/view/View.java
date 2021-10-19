/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint.view;
 
/**
 * This class regroups any view details.
 *
 * @author Talhaoui Yassin - G54892
 */
public class View implements InterfaceView {

    /**
     * Prints a title for the game.
     */
    public void displayTitle() {
        System.out.println("                          ASCII PAINT \n"
                + "                         =============\n");
    }

    /**
     * Asks the user to enter a command line.
     */
    @Override
    public void displayCommandLine() {
        System.out.println("Please enter a command line in this format :\n"
                + "number number number character\n"
                + "For exemple 4 5 3  \n");
    }

    /**
     * Asks the user to chose a shape to display.
     */
    @Override
    public void chooseShape() {
        System.out.println("So, Choose the shape to add in the drawing area\n"
                + "You have the choose between circle, rectangle and square\n");
    }

    /**
     * Asks a message that asks the user if he wants to add an other shape.
     */
    @Override
    public void oneMoreShape() {
        System.out.println("Do you want to add a shape ?");
    }

    /**
     * Displays the drawing.
     *
     * @param drawing a String that conatains the drawing to display.
     */
    @Override
    public void displayDrawing(String drawing) {
        System.out.println("\nThe drawing\n"
                + "------------\n"
                + drawing);
    }
}
