package edu.macalester.comp124;

import acm.program.ConsoleProgram;

import java.awt.*;
import java.util.*;
import java.util.List;



import java.util.LinkedList;


/**
 * Created by Reena on 3/28/14.
 */
public class ListRemove extends ConsoleProgram {
    private int LIST_SIZE = 1000;

    public void run() {

        List<String> words = new ArrayList<String>();

        for (int i =0 ; i < 1000; i++) {
            words.add(i, "Reena");
        }

        long before = System.currentTimeMillis();
        int numChar = 0;
        for (int i =0 ; i < 1000; i++) {
            numChar += words.get(0).length();
            words.remove(0);

        }
        long after = System.currentTimeMillis();
        double elapsed = (after - before) / 1000.0;

        double average = elapsed/LIST_SIZE;
        println(average);




        List<String> word = new LinkedList<String>();
        for (int i =0 ; i < 1000; i++) {
            word.add(i, "Reena");
        }

        long before2 = System.currentTimeMillis();
        int numChar2 = 0;
        for (int i =0 ; i < 1000; i++) {
            numChar2 += word.get(0).length();
            word.remove(0);
        }
        long after2 = System.currentTimeMillis();
        double elapsed2 = (after2 - before2) / 1000.0;

        double average2 = elapsed2/LIST_SIZE;
        println(average2);

    }



}
