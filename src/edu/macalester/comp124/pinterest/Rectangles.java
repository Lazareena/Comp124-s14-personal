package edu.macalester.comp124.pinterest;

import acm.graphics.GCompound;
import acm.graphics.GRect;

import java.awt.*;

/**
 * Created by Reena on 3/11/14.
 */
public class Rectangles extends GCompound{

    public Rectangles (int width, int height){

        GRect manyRect[] = new GRect[23];
        int a = width*6;
        int b = 0;
        int index =0;
        for(int i=0; i<23; i++){
            manyRect[i] = new GRect(width,height);
            manyRect[i].setFilled(true);
            manyRect[i].setColor(new Color(255, 197, 53));
            add(manyRect[index], a, b);
            index++;
            a-=0.5*width;
            b-=0.5*height;

            if (index==23){
                break;
            }
//            if (i==0) {
//                add(manyRect[0], 0, 0);
//            } else if (i==1) {
//                add(manyRect[1], width*3, 0);
//            } else if (i==2) {
//                add(manyRect[2], width*2.5, -height/2);
//            } else if (i==3) {
//                add(manyRect[3], width*2.0, -height);
//            }


        }

    }
}
