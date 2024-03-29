package org.example;

public class Student extends Person{
    public String status;

    public Student(String name, String address, int phoneNumber, String email, String status) {
        super(name, address, phoneNumber, email);
        this.status = status;
    }

}
