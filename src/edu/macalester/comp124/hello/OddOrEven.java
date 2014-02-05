package edu.macalester.comp124.hello;

import acm.graphics.GLabel;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

/**
 * Created by Reena on 2/4/14.
 */
public class OddOrEven extends ConsoleProgram {

    public void run(){

        println("This program states whether an integer is odd or even.");
        int i = readInt("Enter i: ");


        if( i % 2 == 0){
            println(i + " " + "is even");
        } else {
            println(i + " " + "is odd");
        }
    }
}
