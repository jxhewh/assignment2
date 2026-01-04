package models;

public class Manager extends Employee {

    public Manager(String name, String surname, double salary) {
        super(name, surname, "Manager", salary);
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}
