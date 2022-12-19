public class Main {
    public static void main(String[] args) {
        Employee[] staff = new Employee[10];
        staff[0] = new Employee("Иванов", "Иван", "Иванович", 1, 90_000);
        staff[1] = new Employee("Смирнов", "Алексей", "Петрович", 1, 75_000);
        staff[2] = new Employee("Парамонов", "Илья", "Михайлович", 2, 82_000);
        staff[3] = new Employee("Петров", "Александр", "Сергеевич", 2, 85_000);
        staff[4] = new Employee("Воронин", "Николай", "Петрович", 3, 80_000);
        staff[5] = new Employee("Сергеев", "Максим", "Алексеевич", 3, 90_000);
        staff[6] = new Employee("Михайлов", "Сергей", "Иванович", 4, 65_000);
        staff[7] = new Employee("Бобров", "Петр", "Олегович", 4, 68_000);
        staff[8] = new Employee("Белов", "Василий", "Александрович", 5, 76_000);
        staff[9] = new Employee("Виноградов", "Яков", "Евгеньевич", 5, 65_000);
        printListOfEmployees(staff);
        printAmountOfMonthlySalaries(staff);
        printEmployeesWithMinSalary(staff);
        printEmployeesWithMaxSalary(staff);
        printAverageOfSalaries(staff);
        printListOfFullNamesOfEmployees(staff);
    }


    //Метод, который выводит список сотрудников со всеми имеющимися по ним данными:
    public static void printListOfEmployees(Employee[] employee){
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    //Метод, который считает сумму затрат на зарплаты в месяц
    public static int calculateAmountOfMonthlySalaries(Employee[] employee){
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum += employee[i].getSalary();
        }
        return sum;
    }

    //Метод, который печатает сумму затрат на зарплаты в месяц
    public static void printAmountOfMonthlySalaries(Employee[] employee){
        System.out.println("Сумма затрат на зарплаты в месяц составила " + calculateAmountOfMonthlySalaries(employee) + " руб.");
    }

    //Метод, который ищет размер минимальной зарплаты
    public static int findMinSalary(Employee[] employee){
        int minSalary = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
            }
        }
        return minSalary;
    }

    //Метод, который печатает информацию о сотрудниках с минимальной зарплатой
    public static void printEmployeesWithMinSalary(Employee[] employee){
        int minSalary = findMinSalary(employee);
        System.out.println("Минимальная зарплата " + minSalary + " руб. у сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() == minSalary) {
                printFullName(employee[i]);
            }
        }
    }

    //Метод, который ищет размер максимальной зарплаты
    public static int findMaxSalary(Employee[] employee){
        int maxSalary = employee[0].getSalary();
        for (int i = 1; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
            }
        }
        return maxSalary;
    }

    //Метод, который печатает информацию о сотрудниках с максимальной зарплатой
    public static void printEmployeesWithMaxSalary(Employee[] employee){
        int maxSalary = findMaxSalary(employee);
        System.out.println("Максимальная зарплата " + maxSalary + " руб. у сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() == maxSalary) {
                printFullName(employee[i]);
            }
        }
    }

    //Метод, который считает среднее значение зарплат
    public static double calculateAverageOfSalaries(Employee[] employee){
        return (double) calculateAmountOfMonthlySalaries(employee)/ employee.length;
    }

    //Метод, который печатает среднее значение зарплат
    public static void printAverageOfSalaries(Employee[] employee){
        System.out.printf("Среднее значение зарплат составляет %.2f руб.\n", calculateAverageOfSalaries(employee));
    }

    //Метод, который печатает ФИО сотрудника
    public static void printFullName(Employee employee){
        System.out.println(employee.getLastName() + " " + employee.getName() + " " + employee.getPatronymic());
    }

    //Метод, который печатает ФИО всех сотрудников
    public static void printListOfFullNamesOfEmployees(Employee[] employee){
        for (int i = 0; i < employee.length; i++) {
            printFullName(employee[i]);
        }
    }
}