public class SalaryCalculation {

    public static double salaryCalculationAllSum(Employee[] arrayOfEmployees) {
        double sum = 0;
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i] != null) {
                sum += arrayOfEmployees[i].getEmployeeSalary();
            }
        }
        System.out.println("Зарплата всех сотрудников за месяц: " + sum + " $.");
        return sum;
    }

    public static void minimumSalaryEmployee(Employee[] arrayOfEmployees) {
        double minSalary = arrayOfEmployees[0].getEmployeeSalary();
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i] != null) {
                if (minSalary > arrayOfEmployees[i].getEmployeeSalary()) {
                    minSalary = arrayOfEmployees[i].getEmployeeSalary();
                }
            }
        }
        System.out.println("Минимальная зарплата сотрудника: " + minSalary + " $.");
    }

    public static void maximumSalaryEmployee(Employee[] arrayOfEmployees) {
        double maxSalary = 0;
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i] != null) {
                if (maxSalary < arrayOfEmployees[i].getEmployeeSalary()) {
                    maxSalary = arrayOfEmployees[i].getEmployeeSalary();
                }
            }
        }
        System.out.println("Максимальная зарплата сотрудника: " + maxSalary + " $.");
    }

    public static void averageValueOfSalaries(Employee[] arrayOfEmployees) {
        double sum = 0;
        for (int i = 0; i < arrayOfEmployees.length; i++) {
            if (arrayOfEmployees[i] != null) {
                sum += arrayOfEmployees[i].getEmployeeSalary();
            }
        }
        System.out.println("Среднее значение зарплат : " + sum/arrayOfEmployees.length + " $.");
    }
}