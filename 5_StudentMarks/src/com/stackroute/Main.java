//5. Write a program, which reads number of students and n grades as input (of int between
//0 and 100, inclusive) and displays the average, minimum and maximum.Your program
//shall check for valid input. You should keep all the grades in an int[] and use a method for
//each of the computations.
//Output:
//Enter the number of students: 4Enter the grade for student 1: 86
//Enter the grade for student 2: 65
//Enter the grade for student 3: 98
//Enter the grade for student 4: 77
//The average is 81.50
//The minimum is 65
//The maximum is 98

package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numStudents=scanner.nextInt();
        int[] studentGrades=new int[numStudents];
        for(int i=0;i<numStudents;i++)
        {
            System.out.format("Enter grade of student %d: ", i+1);
            studentGrades[i]=scanner.nextInt();
            if(studentGrades[i]<0 ||studentGrades[i]>100)
            {
                System.out.println("Invalid Entry");
                i--;
            }
        }
        System.out.println("The average is: "+avgMark(studentGrades));
        System.out.println("The minimum is: "+minMark(studentGrades));
        System.out.println("The maximum is : "+maxMark(studentGrades));

    }
    public static int maxMark(int[] arr)
    {
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }
    public static int minMark(int[] arr)
    {
        int min = Arrays.stream(arr).min().getAsInt();
        return min;
    }
    public static double avgMark(int[] arr)
    {
        double sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        double avg=sum/arr.length;
        return avg;
    }
}
