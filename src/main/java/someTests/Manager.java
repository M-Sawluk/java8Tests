package someTests;

/**
 * Created by Mike on 2017-06-04.
 */
public class Manager extends Employee {
    public Manager(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + super.getName() + '\'' +
                '}';
    }
}
