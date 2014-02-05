package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 2/5/14.
 */
public class multiplyThreeNumbers extends ConsoleProgram {

    public void run(){

        println(" This program multiplies three integers.");

        int outcome= 1;
        for(int i = 0; i < 3; i++){
            int value = readInt("Enter value:  ");
            outcome = outcome * value;

        }
        println("The product is" + outcome + ".");
    }
}
