package org.example;

public class Stuff extends Employee{
    public String title;
    public Stuff(String name, String address, int phoneNumber, String email, String office, int salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.title=title;
    }

    public int getSalary() {
        return super.salary;
    }

}
