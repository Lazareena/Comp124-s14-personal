package edu.macalester.comp124.pinterest;

import acm.graphics.GCompound;
import acm.graphics.GObject;
import acm.graphics.GPolygon;

import java.awt.*;

/**
 * Created by Reena on 3/10/14.
 */
public class Triangles extends GCompound {

    public Triangles(double sideLength){

        GPolygon triangle = new GPolygon();
        triangle.addVertex(sideLength/2, 0);
        triangle.addVertex(0, Math.sqrt(Math.pow(sideLength,2)- Math.pow((sideLength/2),2)));
        triangle.addVertex(sideLength, Math.sqrt(Math.pow(sideLength,2)- Math.pow((sideLength/2),2)));
        triangle.setFillColor(Color.BLUE);
        triangle.setFilled(true);
        add(triangle);

    }
}
