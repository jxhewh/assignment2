package models;

import interfaces.Payable;

public class Person implements Payable, Comparable<Person> {

    private static int idCounter = 1;

    protected int id;
    protected String name;
    protected String surname;

    public Person() {
        this.id = idCounter++;
    }

    public Person(String name, String surname) {
        this.id = idCounter++;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }
}
