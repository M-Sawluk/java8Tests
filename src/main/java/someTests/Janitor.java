package someTests;

/**
 * Created by Mike on 2017-06-04.
 */
public class Janitor extends Employee {
    public Janitor(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Janitor{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
