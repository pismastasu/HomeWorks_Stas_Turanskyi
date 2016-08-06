package Task4;

/**
 * Created by Stanislav on 31.07.2016.
 */
public class Manager {
    private String name;
    private String surname;
    private String department;
    privat int countManager = 0;

    public Manager(String name, String surname, Department department) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.countManager = countManager;
    }

    public Manager() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getCountManager() {
        return countManager;
    }

    public void setCountManager(int countManager) {
        this.countManager = countManager;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", department=" + department +
                '}';
    }


}
