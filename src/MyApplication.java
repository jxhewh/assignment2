import models.*;
import java.util.*;

public class MyApplication {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Student("Alice", "Brown", 2.0));
        people.add(new Employee("Mark", "Lee", "Singer", 27045.78));
        people.add(new Student("Nargiz", "Mukanova", 2.9));
        people.add(new Employee("Clinton", "Cave", "Guitarist", 50000));

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> people) {
        for (Person p : people) {
            System.out.println(
                    p.toString() + " earns " +
                            String.format("%.2f", p.getPaymentAmount()) +
                            " tenge"
            );
        }
    }
}
