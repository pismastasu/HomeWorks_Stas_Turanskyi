package Task4;

import java.util.Arrays;

/**
 * Created by Stanislav on 31.07.2016.
 */
public class Company {
    private String bossName;
    private Department[] departments=new Department[10];
    private Manager[] managers = new Manager[10];
    private Employee[] employees =new Employee[10];
    private int countDepartment=0;
    private int countManager=0;
    private int countEmployee=0;

    public Company() {
            }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getCountDepartment() {
        return countDepartment;
    }

    public void setCountDepartment(int countDepartment) {
        this.countDepartment = countDepartment;
    }

    public void setCountEmployee(int countEmplyee){
        this.countEmployee = countEmplyee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "bossName='" + bossName + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", countDepartment=" + countDepartment +
                '}';
    }
// 1 фунционал добавления Отделов
    public boolean addDepartment(String name){
        if(countDepartment<departments.length){
            Department department = new Department;
            department.setName(name);
            departments[countDepartment++]=department;
            return true;
        }
        return false;
    }
// 2 функционал добавления Менеджера в Департмент по Имени и Фамилии
    public boolean addManager (String name, String surname, String departmentName){
        if (countManager < managers.length) {
            Manager manager= new Manager();
            manager.setName(name);
            manager.setSurname(surname);
            if(departmentName==null&&!departmentName.trim().isEmpty()){
                Department department=findDepartmentByName(departmentName);
                if(department!=null){
                    manager.setDepartment(department);
                    }
            }
            managers[countManager++]=manager;
            return true;
        }
        return false;
    }

    public Department findDepartmentByName(String name){
        for (Department department: departments){
            if (department.getName().equals(name)){
                return department;
            }
        }
    }

    public Employee findEmployeeByName(String name, String surname){
        for (Employee employee:employees )
            if (employee.getName().equals(name)){
                return employee;
            }
        }
    }

    public boolean addEmployeeToCompany(String name, String surname, String departmentName){
        if (countEmployee < employees.length) {
            Employee employee= new Employee();
            employee.setName(name);
            employee.setSurname(surname);
            if(departmentName==null&&!departmentName.trim().isEmpty()){
                Department department=findDepartmentByName(departmentName);
                if(department!=null){
                    employee.setDepartment(department);
                }
            }
            employee.department[countEmployee++]=department;
            return true;
        }
        return false;
    }

    public boolean addEmployeeToCompany(String name, String surname){
        //To Do
        if (countEmployee < employees.length) {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setSurname(surname);
            countEmployee++;
            return true;
        }
        return false;
    }

    public boolean removeEmployeeFromCompany(String Name, String surname){
        //To Do


    }

    public boolean addDepartment(String Name, String surname){
        //To Do
    }

    public boolean removeDepartment(String Name, String surname){
        //To Do
    }

// изменение департамента у сотрудника
    public boolean changeEmployeeDepartment(String employeeName, String employeeSurname, String fromDepartmentName, String toDepatmentName){
        //To Do
    }


}
