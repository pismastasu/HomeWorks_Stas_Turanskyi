package Task4;

/**
 * Created by Stanislav on 31.07.2016.
 */
public class Department {
    private String name;
    private Manager departmentManager;
    private Employee[] employee;
    private int countEmployee=0;

    public Department() {
    }

    public Department(String name, Manager departmentManager, Employee[] employee, int countEmployee) {
        this.name = name;
        this.departmentManager = departmentManager;
        this.employee = employee;
        this.countEmployee = countEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getDepartmentManager() {
        return departmentManager;
    }

    public void setDepartmentManager(Manager departmentManager) {
        this.departmentManager = departmentManager;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public int getCountEmployee() {
        return countEmployee;
    }

    public void setCountEmployee(int countEmployee) {
        this.countEmployee = countEmployee;
    }
// функционал 2 (по ссылке)
// TO DO
    public boolean addEmployee (String name, String sername){
       // To Do

       if(countEmployee<employee.length){
           Employee employee = new Employee;
           employee.setName(name);
           employee.setSername(sername);
           employee[countEmployee++]=employee;
           return true;
       }
       return false;

    }

    public boolean addEmployeeToDepartment (String name, String sername){
        // To Do

        if(countEmployee<employee.length){
            Employee employee = new Employee;
            employee.setName(name);
            employee.setSername(sername);
            employee[countEmployee++]=employee;
            return true;
        }
        return false;
    }

    //
    public Department findDepartmentByName(String name, String surname){
        for (Company employee:employees )

            if (employee.getName().equals(name)){
                return employee;
            }
    }

    public boolean removeEmployeeFromDepartment (String name, String surname, String department){
        // To Do
        Employee employee = new Employee;
        employee.deleteName(name);
        employee.deleteSurname(sername);
        employee.deleteDepartment(department);
        employee[countEmployee--];
        }

    public boolean removeEmployee (String name, String surname){
        // To Do
        Employee employee = new Employee;
        employee.deleteName(name);
        employee.deleteSurname(sername);
        employee[countEmployee--];
    }


}
