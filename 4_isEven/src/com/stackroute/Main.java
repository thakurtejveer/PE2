//4. Write a boolean method called isEven() in a class called EvenNumTest, which takes an
//int as input and returns true if the input is even. The signature of the method is as follows:
//public static boolean isEven(int number)

package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number here to check whether it is even or not: ");
        int n=scanner.nextInt();
        System.out.println(isEven(n));

    }
    public static boolean isEven(int number){
        return (number%2==0);
    }
}
