package edu.macalester.comp124.hello;

import acm.graphics.GLabel;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

/**
 * Created by Reena on 2/3/14.
 */
public class DoNTimes extends ConsoleProgram {

    public void run() {

        println("This program lists the integers 0...9");
               for( int i = 0; i < 10; i++){

                   println(i);
               }

        println("This program lists the integers 0...10");
        for( int i = 0; i <= 10; i++){

            println(i);
        }

        println("This program lists the integers 10...0");
                for( int i = 10; i >= 0; i--){

                    println(i);
                }
        println("This program lists the integers 10...1 ");
                for(int i = 10; i >0; i--){

                    println(i);
                }
        println("This program lists the integers 1,2,4...32");
                for(int i = 1; i <= 32; i= i* 2){

                    println(i);
                }
        println("This program lists the integers 32,16,8...1");
                for(int i= 32; i >= 1; i= i/2){

                    println(i);
                }

    }

    }
