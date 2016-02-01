/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonmethod;

import java.util.ArrayList;

/**
 *
 * @author hea113
 */
public class NewtonMethod {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewtonsMethodCalculator nmc = new NewtonsMethodCalculator();
        nmc.setLocation(870, 90);
        nmc.setVisible(true);     
    }
    
    /**
     * Recursive function that calculates the root using newton's method
     * @param x
     * @param function
     * @param functionPrime
     * @param diff
     * @param iteration 
     */
    public static void newtonMethod(double x, double function, double functionPrime, double diff, int iteration){    
        double tempx = x;
        function = 2*x*x*x*x - 3*x*x*x + 7*x-11; // function
        functionPrime = 8*x*x*x - 9*x*x + 7; // the derivative of the function
        diff = function / functionPrime; // the difference between the function and derivative
        x = x - diff; //newtons method
        System.out.printf("X"+ iteration+ ": %f" + " f(x): %f\n", x, function);
        printToTextArea("X"+ iteration + ":  " + x + "   f(x): " + function + "\n");
        iteration++;
        // if new solution - old solution is less than 0.0001 then stop
        if (tempx - x < 0.0001){
            System.out.println("End");
            printToTextArea("End!\n");
        }else{
            newtonMethod(x,function, functionPrime,diff, iteration);
        }   
    }
    
    /**
     * prints to the JText area
     * @param text 
     */
    public static void printToTextArea(String text){
        NewtonsMethodCalculator.addToTextArea(text);
    }
}
