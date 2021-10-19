/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g54892.atlg3.asciipaint;

import g54892.atlg3.asciipaint.controller.Application;

/**
 * The application entry point.
 *
 * @author Talahoui Yassin - G54892.
 */
public class Main {

    public static void main(String[] args) {
        try {
            new Application().start();
        } catch (Exception e) {
            System.out.println("You have made a type of error " + e);
        }
    }
}
