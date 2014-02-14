package edu.macalester.comp124.hello;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 2/12/14.
 */
public class PrimeNumbers extends ConsoleProgram {


    public void run() {
         int total = 0;

        while (true){

            int Int = readInt("");
            if (Int < SENTINEL) break;

            total = countPrimes(Int);

    }
        println("The total number of prime numbers are" + " " + total);
    }

//* This method counts the number of prime numbers

    int max = 0;
    public int countPrimes(int number){

        if (isPrime (number) == true) {

            max = max + 1;

        }
        return max;
    }


//* This method declares whether a number is a prime number

    private boolean isPrime(int value){

                   for (int c = 2; c < value; c++ ){
                       if (value % c == 0){
                           return(false);
    }

                   }
        return true;


    }

        private static final int SENTINEL = 0;

}




