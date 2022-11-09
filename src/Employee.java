import java.util.Objects;

public class Employee {
    private final String fullNameOfTheEmployee;
    public double employeeSalary;
    public int department;
    private final int id;

    public static int idCounter = 1;

    public static void printAllArrayValues(Employee[] arrayOfEmployees) {
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i] != null) {
                System.out.println(arrayOfEmployees[i]);
            }
        }
    }

    public static void printFullNameEmloyee(Employee[] arrayOfEmployees) {
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i] != null) {
                System.out.println(arrayOfEmployees[i].getFullNameOfTheEmployee());
            }
        }
    }


    public Employee(String fullNameOfTheEmployee, double employeeSalary, int department) {
        this.fullNameOfTheEmployee = fullNameOfTheEmployee;
        this.employeeSalary = employeeSalary;
        this.department = department;
        this.id = idCounter++;
    }

    @Override
    public String toString() {
        return "Сотрудник (Артист) {" +
                "Поное имя (Ф.И.О.)'" + fullNameOfTheEmployee + '\'' +
                ", заработная плата = " + employeeSalary + " $" +
                ", отдел = " + department +
                ", ID сотрудника = " + id +
                '}';
    }

    public String getFullNameOfTheEmployee() {
        return fullNameOfTheEmployee;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public int getDepartment() {
        return department;
    }

    public int getEmployeeId() {
        return id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public void setEmployeeSalary(float employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.employeeSalary, employeeSalary) == 0 && department == employee.department && id == employee.id && fullNameOfTheEmployee.equals(employee.fullNameOfTheEmployee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullNameOfTheEmployee, employeeSalary, department, id);
    }
}

