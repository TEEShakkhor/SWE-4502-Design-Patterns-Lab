package org.example;

public class Fulltime extends Stuff{

    public Fulltime(String name, String address, int phoneNumber, String email, String office, int salary, MyDate dateHired, String title) {
        super(name, address, phoneNumber, email, office, salary, dateHired, title);

    }
    public int getSalary(int fixedSalary){
        return super.salary;
    }
    @Override
    public String toString() {
        return this.name + this.getClass().getSimpleName();
    }
}
