package edu.macalester.comp124.pinterest;
import acm.graphics.GCanvas;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import javafx.scene.paint.Color;

/**
 * Created by Reena on 3/8/14.
 */
public class Photo extends GraphicsProgram {

    public void run(){

        setBackground(java.awt.Color.getHSBColor(150, 148, 50));

        Rectangles i = new Rectangles(50, 25);
        add(i, (getWidth()*1.25)/2, getHeight()/2);

        Rectangles j = new Rectangles(50, 25);
        add(j, getWidth()*3/4, getHeight()/4);

        Rectangles k = new Rectangles(50, 25);
        add(k, 0, getHeight()+10);

        Rectangles l = new Rectangles(50, 25);
        add(l, (getWidth()*0.5)/2, (getHeight()*3.8)/4);

        Circles d = new Circles(25,25);
        add(d, (getWidth()-((getWidth())*5)/8- 25)/2, (getHeight()-(getHeight())/2 -25)/2 );

        Circles e = new Circles(10,10);
        add(e,(getWidth()*1.5)/4, (getHeight()*5.3)/8 );

        Circles f = new Circles(5,5);
        add(f, (getWidth()*2.5)/4 , (getHeight()*3)/4);

        Circles g = new Circles(3,3);
        add(g, (getWidth()*3.6)/4 , (getHeight()*7.3)/8);

        Circles h = new Circles(3,3);
        add(h, (getWidth()*3.1)/4 , (getHeight()*7)/8);

    }

}

