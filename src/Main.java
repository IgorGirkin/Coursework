public class Main {
    public static void printSeparator() {
        System.out.println("+++++++++++++++++++++++");
    }
    public static void main(String[] args) {
        Employee[] arrayOfEmployees = new Employee[10];
        arrayOfEmployees[0] = new Employee("Роберт Неста Марли", 15220, 3);
        arrayOfEmployees[1] = new Employee("Ричард Старки", 500000, 1);
        arrayOfEmployees[2] = new Employee("Джон Уинстон Леннон", 10000000, 5);
        arrayOfEmployees[3] = new Employee("Джеффри Лебовски (Чувак)", 53.99, 4);
        arrayOfEmployees[4] = new Employee("Брайан Дуглас Уилсон", 95462, 3);
        arrayOfEmployees[5] = new Employee("Джеймс Маршалл (Джими) Хендрикс", 23689, 5);
        arrayOfEmployees[6] = new Employee("Джеймс Дуглас Моррисон", 55846, 5);
        arrayOfEmployees[7] = new Employee("Ангус МакКиннон Янг", 364822, 3);
        arrayOfEmployees[8] = new Employee("Джордж Рооджер Уотерс", 5600, 1);
        arrayOfEmployees[9] = new Employee("Брайан Гарольд Мэй", 26665, 1);

        printSeparator();
        Employee.printAllArrayValues(arrayOfEmployees);
        printSeparator();
        SalaryCalculation.salaryCalculationAllSum(arrayOfEmployees);
        printSeparator();
        SalaryCalculation.minimumSalaryEmployee(arrayOfEmployees);
        printSeparator();
        SalaryCalculation.maximumSalaryEmployee(arrayOfEmployees);
        printSeparator();
        SalaryCalculation.averageValueOfSalaries(arrayOfEmployees);
        printSeparator();
        Employee.printFullNameEmloyee(arrayOfEmployees);
        printSeparator();

    }
}