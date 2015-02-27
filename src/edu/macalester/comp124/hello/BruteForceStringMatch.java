package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 9/28/14.
 */
public class BruteForceStringMatch extends ConsoleProgram {
    public void run() {
//         System.out.println(stringMatch("The man died", "die"));
//    }

//    public int stringMatch(String Text, String Key) {
        String Text = "The man did die";
        String Key = "die";

        char[] lettersText = Text.toCharArray();
        char[] lettersKey = Key.toCharArray();
//        System.out.println(lettersText.length - lettersKey.length);

        for (int i = 0; i <= (lettersText.length - lettersKey.length); i++) {
            int j = 0;
            System.out.println("Pos" + "=" + i);
            System.out.println(Text);
            String numberOfSpace = new String(new char[i]).replace('\0', ' ');
            System.out.println(numberOfSpace + Key);

            while (j < lettersKey.length && (lettersText[i + j] == lettersKey[j])) {
                j = j + 1;
//                System.out.println(j);
                String numberOfSpace2 = new String(new char[i+j]).replace('\0', ' ');
                System.out.println(numberOfSpace + Key);

                if (j == lettersKey.length) {
                    System.out.println(i);
                }
            }


        }

    }

}
