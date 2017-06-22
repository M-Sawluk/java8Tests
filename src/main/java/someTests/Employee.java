package someTests;

/**
 * Created by Mike on 2017-06-04.
 */
public class Employee implements Comparable<Employee> {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public Employee() {
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
