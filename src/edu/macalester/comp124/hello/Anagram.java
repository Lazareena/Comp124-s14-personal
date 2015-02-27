package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 9/15/14.
 */
public class Anagram extends ConsoleProgram {
    public void run() {
        System.out.println(anagramDetector("Sweet", "twees"));
    }
//* This method takes in two Strings and decides if they are an anagram
    public boolean anagramDetector(String A, String B) {

        String ALower= A.toLowerCase();
        String BLower= B.toLowerCase();

        char[] lettersA= ALower.toCharArray();
        char[] lettersB= BLower.toCharArray();

        if (lettersA.length != lettersB.length) {
            return false;
        } else {
            for (int i = 0; i < lettersA.length; i++) {
                for (int j = 0; j < lettersB.length; j++) {
                    if (lettersA[i] == lettersB[j]) {
                        lettersB[j] = ' ';
                        break;
                    }
                }
            }
            for (int k = 0; k < lettersB.length; k++) {
                if (lettersB[k] != ' ') {
                    return false;
                }
            }
        }
        return true;

    }


}
