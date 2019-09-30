package com.stackroute;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public void setFirstName(String s1) {
        this.firstName = s1;
    }

    public void setLastName(String s2) {
        this.lastName = s2;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

