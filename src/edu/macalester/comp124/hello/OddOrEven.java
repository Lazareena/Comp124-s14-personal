package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 2/4/14.
 */
public class OddOrEven extends ConsoleProgram {

    public void run(){

        println("This program states whether an integer is odd or even.");


        while(true){
            int i = readInt("Enter i: ");

            if( i % 2 == 0){
                println(i + " " + "is even");
            } else if (i < 0) {
                break;
            } else {
                println(i + " " + "is odd");
            }
        }

    }
}
