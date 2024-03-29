package org.example;

public class Parttime extends Stuff{
    public int hourRate,hour;
    public Parttime(String name, String address, int phoneNumber, String email, String office, int salary, MyDate dateHired, String title, int hourRate, int hour) {
        super(name, address, phoneNumber, email, office, salary, dateHired, title);
        this.hour=hour;
        this.hourRate=hourRate;
    }
    public int getSalary(int hourRate, int rate){
        return hourRate*rate;
    }
    @Override
    public String toString() {
        return this.name + this.getClass().getSimpleName();
    }
}
