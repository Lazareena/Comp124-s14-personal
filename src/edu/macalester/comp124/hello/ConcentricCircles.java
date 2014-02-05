package edu.macalester.comp124.hello;

import acm.graphics.GOval;
import acm.program.GraphicsProgram;

/**
 * Created by Reena on 2/5/14.
 */
public class ConcentricCircles extends GraphicsProgram {

    public void run(){

        GOval oval1 = new GOval(100, 100, 50, 50);
        oval1.setFilled(false);
                add(oval1);
        GOval oval2 = new GOval(75, 75, 100, 100);
        oval2.setFilled(false);
        add(oval2);
        GOval oval3 = new GOval(50, 50, 150, 150);
        oval3.setFilled(false);
        add(oval3);

    }
}
