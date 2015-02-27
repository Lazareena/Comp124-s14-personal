package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 9/15/14.
 */
public class LockerArray extends ConsoleProgram {

    public void run() {

        char lockerOne[] = {'X', 'X', 'X', 'X', 'X','X', 'X', 'X', 'X', 'X' };
        System.out.println(lockerOne);

        for (int i = 0; i < lockerOne.length; i++) {
            lockerOne[i] = 'O';
        }
        System.out.println(lockerOne);

        for (int k = 2; k <= lockerOne.length; k++) {
            for (int j = k; j <= lockerOne.length; j += k) {

                if (lockerOne[j - 1] == 'O') {
                    lockerOne[j - 1] = 'X';
                } else if (lockerOne[j - 1] == 'X') {
                    lockerOne[j - 1] = 'O';
                }
            }
            System.out.println(lockerOne);
        }
    }
}
