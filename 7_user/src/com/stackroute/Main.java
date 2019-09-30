//7. Write a class named User. The class needs four fields (instance variables) with the
//names firstName, lastName age, and salary.
//Complete the class ensuring encapsulation and selection of proper datatypes.
//Ensure age cannot be less than 0 or greater than 100.
//Add a isValidAge method to check that employee age is between 18 to 60.
//Add a getFullName to return the full name of the person.
//NOTE: No methods should be defined static.
//NOTE: Do not add any main method to the solution code.

package com.stackroute;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        User userObject=new User();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first name: ");
        userObject.setFirstName(scanner.next());
//        String firstName=scanner.next();
        System.out.println("Enter last name: ");
        userObject.setLastName(scanner.next());
//        String lastName=scanner.next();
//        int age;
        System.out.println("Enter age: ");
//        age=scanner.nextInt();
        userObject.setAge(scanner.nextInt());
        System.out.println("Enter salary: ");

//        double salary=scanner.nextInt();
        userObject.setSalary(scanner.nextDouble());

        System.out.println("age is valid: "+isValidAge(userObject.getAge()));
        System.out.println("Full name is: "+getFullName(userObject.getFirstName(),userObject.getLastName()));
        System.out.println("Salary is: "+userObject.getSalary());
    }

    public static boolean isValidAge(int n)
    {
//        if(n>=0&&n<=80)
//            return true;
//        else
//            return false;
        return (n>=0&&n<=80);
    }
    public static String getFullName( String s1, String s2)
    {
        String s3=s1+" "+s2;
        return s3;
    }
}
