package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scanner=new Scanner(System.in);
        int enteredNumber=scanner.nextInt();
        if(powerOfFour(enteredNumber))
            System.out.println("yes");
        else
            System.out.println("no");
}

public static boolean powerOfFour(int number){
        if(number==0)
            return false;
        else
        {
            if(number%4!=0)
                return false;
            number/=4;
        }
        return true;
    }
}

