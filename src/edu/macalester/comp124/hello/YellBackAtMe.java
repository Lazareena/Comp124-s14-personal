package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 2/6/14.
 * This program was created with the assistance of this site: http://www.w3schools.com/jsref/jsref_touppercase.asp
 */
public class YellBackAtMe extends ConsoleProgram {

    public void run(){

        while (true) {

        String str = readLine("");

        if(str.equals("stop")) break;

            String STR = str.toUpperCase();

            println(STR);

        }


    }
}
