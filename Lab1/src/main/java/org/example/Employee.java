package org.example;

public class Employee extends Person{
    public String office;
    public int salary;
    public MyDate dateHired;

    public Employee(String name, String address, int phoneNumber, String email, String office, int salary, MyDate dateHired) {
        super(name, address, phoneNumber, email);
        this.office=office;
        this.salary=salary;
        this.dateHired=dateHired;
    }


}
