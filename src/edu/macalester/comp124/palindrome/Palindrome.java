package edu.macalester.comp124.palindrome;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 2/13/14.
 */
public class Palindrome extends ConsoleProgram {

    public void run(){


        while(true){
            String pal = readLine("Enter word that might be Palindrome (or quit to stop)?");

           if (isPalindrome(pal)== true){
               println(pal + " " + "is a palindrome");
           }
            else if (isPalindrome(pal)==false){
               println(pal + " " + "is not a palindrome");
           }
            if(pal.equals("quit")){
                break;
            }

        }


    }

    public boolean isPalindrome(String k){


        for(int i = 0; i <= k.length()-1; i++){

            char a = k.charAt(i);
            char z = k.charAt(k.length()-1-i);

            if(a!=z){
                return false;
            }
        }

        return true;


}
}
