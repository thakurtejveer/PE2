//1. Write a Java method to Reverse the given input & Check if it is a Palindrome.
//------------------------------------------------------------------------------------------------------------------------
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter String here: ");
        Scanner scanner=new Scanner(System.in);
        String enteredString=scanner.nextLine();
        String answerString="";
        int count=0;
        for(int i=0;i<enteredString.length();i++)
        {
            answerString=answerString+enteredString.charAt(enteredString.length()-1-i);
            if(enteredString.charAt(i)!=enteredString.charAt(enteredString.length()-1-i))
            {
                count++;
            }
        }
        System.out.println(answerString);
        if(count==0)
            System.out.println("Entered String is palindrome");
        else
            System.out.println("Entered String is not palindrome");
    }
}
