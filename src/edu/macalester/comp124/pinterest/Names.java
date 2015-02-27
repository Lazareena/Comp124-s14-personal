package edu.macalester.comp124.pinterest;

import acm.program.ConsoleProgram;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Reena on 3/26/14.
 */
public class Names extends ConsoleProgram {
    public void run() {
    long before = System.currentTimeMillis();
    List<String> names = new ArrayList<String>();

        for(int i= 0; i <= 1000000; i++) {
        names.add(i, "Reena");
    }
    long after = System.currentTimeMillis();
    println((after - before)/1000.0);

}
}