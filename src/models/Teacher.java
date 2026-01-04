package models;

public class Teacher extends Employee {

    public Teacher(String name, String surname, double salary) {
        super(name, surname, "Teacher", salary);
    }

    @Override
    public String toString() {
        return "Employee: " + super.toString();
    }
}
