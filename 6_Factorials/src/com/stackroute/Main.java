//6. Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
// signed integer). Your output shall look like:
//Int Factorials:
//The factorial of 1 is 1
//The factorial of 2 is 2
//..........
//The factorial of 12 is 479001600
//he factorial of 13 is out of range
//Modify your program and add a method called longFactorial to list all the factorial that can
//be expressed as a long (64-bit signed integer).The maximum value for long is kept in a
//constant called Long.MAX_VALUE.
//your output shall look like:
//Long Factorials:The factorial of 1 is is 1.
//The factorial of 2 is is 2.
//..........
//The factorial of 20 is is 2432902008176640000.
//The factorial of 21 is out of range.

package com.stackroute;

public class Main {

    public static void main(String[] args) {
//        int factorial=1;
//        int i=1;
//	while(i<2147483647/factorial)
//    {
//        factorial*=i;
//        System.out.format("The factorial of %d is %d ",i,factorial);
//        System.out.println();
//        i++;
//    }
//        System.out.format("The factorial of %d is out of range.",i);
        long factorial=1L;
        long i=1L;
        while(i<9223372036854775807L/factorial)
        {
            factorial*=i;
            System.out.format("The factorial of %d is %d ",i,factorial);
            System.out.println();
            i++;
        }
        System.out.format("The factorial of %d is out of range.",i);
    }
}
