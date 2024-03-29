package org.example;

import org.w3c.dom.ls.LSOutput;

public class Faculty extends Employee{
    public String officeHour;
    public String rank;
    public Faculty(String name, String address, int phoneNumber, String email, String office, int salary, MyDate dateHired, String officeHour, String rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHour=officeHour;
        this.rank=rank;

    }
}
