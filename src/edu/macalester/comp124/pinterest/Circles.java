package edu.macalester.comp124.pinterest;

import acm.graphics.GCompound;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GCompound;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import acm.graphics.GPolygon;

import java.lang.reflect.Array;

/**
* Created by Reena on 3/8/14.
*/
public class Circles extends GCompound {


    public Circles(int width, int height) {

        GOval circle = new GOval( width,  height);
        add(circle);

        if(width>=25 && height>=25){
        GOval smallCircles[] = new GOval[24];
        int sizeSmallCircle= 140;
        int a = 15;
            for(int i= 0; i< 24; i++){
                smallCircles[i] =  new GOval((width-sizeSmallCircle)/2, (height-sizeSmallCircle)/2, sizeSmallCircle, sizeSmallCircle);
                add(smallCircles[i]);
                smallCircles[i].movePolar((width/2) + (sizeSmallCircle/2), a);
                a+= 15;
                if (i%2 != 0 ) {
                    smallCircles[i].setFillColor(new Color(255, 237, 62));
                    smallCircles[i].setFilled(true);

                } else if (i%2 == 0 ){
                    smallCircles[i].setFillColor(new Color(88, 150, 143));
                    smallCircles[i].setFilled(true);
                }
               if (i == 23){
                   Triangles t = new Triangles(121.24);
                   add(t, (width / 2) + 23, (height / 2) - 50.4);
                   t.sendForward();
                   smallCircles[i].setVisible(false);

               }
                add(smallCircles[i]);

        }
        } else if (width == 10 && height == 10 ){
            GOval smallCircles[] = new GOval[24];
            int sizeSmallCircle= 95;
            int a = 15;
            for(int i= 0; i< 24; i++){
                smallCircles[i] =  new GOval((width-sizeSmallCircle)/2, (height-sizeSmallCircle)/2, sizeSmallCircle, sizeSmallCircle);
                add(smallCircles[i]);
                smallCircles[i].movePolar((width/2) + (sizeSmallCircle/2), a);
                a+= 15;
                if (i%2== 0){
                    smallCircles[i].setFillColor(Color.BLUE);
                    smallCircles[i].setFilled(true);
                }
                if (i%2 != 0){
                    smallCircles[i].setFillColor(Color.RED);
                    smallCircles[i].setFilled(true);

                }
                add(smallCircles[i]);
            }
        } else if (width == 5 && height ==5){
                GOval smallCircles[] = new GOval[24];
                int sizeSmallCircle= 70;
                int a = 15;
                for(int i= 0; i< 24; i++){
                    smallCircles[i] =  new GOval((width-sizeSmallCircle)/2, (height-sizeSmallCircle)/2, sizeSmallCircle, sizeSmallCircle);
                    add(smallCircles[i]);
                    smallCircles[i].movePolar((width/2) + (sizeSmallCircle/2), a);
                    a+= 15;
                    if (i%2== 0 ) {
                        smallCircles[i].setFillColor(new Color(255, 237, 62));
                        smallCircles[i].setFilled(true);
                    } else if (i%2 != 0 ){
                        smallCircles[i].setFillColor(new Color(88, 150, 143));
                        smallCircles[i].setFilled(true);
                    }
                    if (i == 23){
                        Triangles t = new Triangles(60.62);
                        add(t, (width / 2) + 8, (height / 2) - 25);
                        t.sendForward();
                        smallCircles[i].setVisible(false);

                    }
                    add(smallCircles[i]);
            }

         } else if (width == 3 && height ==3){
            GOval smallCircles[] = new GOval[24];
            int sizeSmallCircle= 40;
            int a = 15;
            for(int i= 0; i< 24; i++){
                smallCircles[i] =  new GOval((width-sizeSmallCircle)/2, (height-sizeSmallCircle)/2, sizeSmallCircle, sizeSmallCircle);
                add(smallCircles[i]);
                smallCircles[i].movePolar((width/2) + (sizeSmallCircle/2), a);
                a+= 15;
                if (i%2== 0){
                    smallCircles[i].setFillColor(Color.BLUE);
                    smallCircles[i].setFilled(true);
                }
                if (i%2 != 0){
                    smallCircles[i].setFillColor(Color.RED);
                    smallCircles[i].setFilled(true);

                }
                add(smallCircles[i]);
            }
        }
    }






}


