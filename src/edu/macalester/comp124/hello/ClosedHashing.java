package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 11/17/14.
 */
public class ClosedHashing extends ConsoleProgram {
    public void run() {

            int tableSize= readInt("");
            int table[] = new int[tableSize];
            int i= 0;

//
//        while (true) {
//
//            int value = readInt("");
//            int hashPosition = SimpleHash(value, tableSize);
//
//                while (table[hashPosition]=! null) {
//                    i++;
//                }
//
//                table[hashPosition + i]=value;
//                println(table);
//            if (value < 0) {
//                break;
//            }
//            }
        }


    public int SimpleHash(int x, int m) {
        return x % m;
    }


}
