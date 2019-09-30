//3. Create a class named Member with Name, age, Salary as its variable, write an other
//class named Member Variable that creates an instance of the Member class, initialises its
//member variables, and then displays the value of each member variable.
//Output: Members Name: Harry
//Potter Members Age: 30
//Members Salary: 2500.3

package com.stackroute;

public class Main {
    public static void main(String[] agrs) {
        MemberName object=new MemberName();
        object.setAge(25);
        object.setName("Harry");
        object.setSalary(6009.5);
        System.out.println(object.getName());
        System.out.println(object.getAge());
        System.out.println(object.getSalary());
    }
}
