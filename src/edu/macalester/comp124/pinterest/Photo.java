package edu.macalester.comp124.pinterest;
import acm.graphics.GCanvas;
import acm.graphics.*;
import acm.program.GraphicsProgram;
import javafx.scene.paint.Color;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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

        addMouseListeners();
    }

    public  void mouseClicked(MouseEvent e) {
        if(e.getX() % 2 == 0 && e.getY() % 2 == 0) {
        Circles add2Circle = new Circles(3,3);
        add(add2Circle, e.getX(), e.getY());
        } else { Circles addCircle = new Circles(5,5);
        add(addCircle, e.getX(), e.getY());
    }
    }

                 GObject obj;
                 double lastX, lastY;
                 @Override
                 public void mousePressed(MouseEvent e) {
                     lastX =e.getX();
                     lastY =e.getY();
                     obj = getElementAt(lastX, lastY);
                 }

                 @Override
                 public void mouseDragged(MouseEvent e) {
                     if ( obj != null) {
                         obj.move(e.getX() - lastX, e.getY()- lastY);
                         lastX = e.getX();
                         lastY = e.getY();
                     }
                 }

}

