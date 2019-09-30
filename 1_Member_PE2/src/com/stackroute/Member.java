//3. Create a class named Member with Name, age, Salary as its variable, write an other
//class named Member Variable that creates an instance of the Member class, initialises its
//member variables, and then displays the value of each member variable.
//Output: Members Name: Harry
//Potter Members Age: 30
//Members Salary: 2500.3


package com.stackroute;

import java.util.Scanner;

public class Member {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=scanner.next();
        System.out.println("Enter age");
        int age=scanner.nextInt();
        System.out.println("Enter Salary: ");
        int salary=scanner.nextInt();

        MemberVariable memberVariable=new MemberVariable();
        memberVariable.main();


    }
}
