package person;

import java.util.Date;

import hospital.Department;
import hospital.Salary;

public abstract class Employe extends Person {
    private Salary salary;
    private Date startDate;
    private Department department;

    public Employe() {
        super();
    }

    public Employe(String firstName, String lastName, Date dateOfBirth, String userName, String password) {
        super(firstName, lastName, dateOfBirth, userName, password);
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public String toString() {
        return "Employe [startDate=" + startDate + "]";
    }

}
