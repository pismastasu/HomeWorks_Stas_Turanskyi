package Task4;

import java.util.Arrays;

/**
 * Created by Stanislav on 31.07.2016.
 */
public class Employee {
    private String name[];
    private String surname[];
    private String department[];
    private int countEmployee = 0;

    public Employee() {
    }

    public DeleteEmployee () {
    }

    public Employee(String name[], String surname[], String department[]) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.countEmployee = countEmployee;
    }

    public Employee(String name[], String surname[]) {
        this.name = name;
        this.surname = surname;
        this.countEmployee = countEmployee;
    }

    public DeleteEmployee(String name[], String surname[], String department[]) {
        // To do: find employee by name, sername, department
        this.deleteName = name;
        this.surname = surname;
        this.department = department;
        this.countEmployee = countEmployee;
    }

    public DeleteEmployee(String name[], String surname[]) {
        // To do: find employee by name, sername
        this.name = name;
        this.surname = surname;
        this.countEmployee = countEmployee;
    }



    public String[] getName() {
        return name;
    }

    public void setName(String name[]) {
        this.name = name;
    }

    public String[] getSurname() {
        return surname;
    }

    public void setSurname(String surname[]) {
        this.surname = surname;
    }

    public String[] getDepartment() {
        return department;
    }

    public void setDepartment(String[] department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(getName(), employee.getName())) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(getSurname(), employee.getSurname());

    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(getName());
        result = 31 * result + Arrays.hashCode(getSurname());
        return result;
    }
}
