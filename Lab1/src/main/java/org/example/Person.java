package org.example;

public class Person {
    public String name;
    public String address;
    public int phoneNumber;
    public String email;

    public Person(String name, String address, int phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    @Override
    public String toString() {
        return this.name + this.getClass().getSimpleName();
    }
}
