public class Employee {
    private String lastName;
    private String name;
    private String patronymic;
    private int department;
    private int salary;
    static int idCount=0;
    private int id;



    public Employee(String lastName, String name, String patronymic, int department, int salary) {
        this.lastName = lastName;
        this.name = name;
        this.patronymic = patronymic;
        this.department = department;
        this.salary = salary;
        this.id = idCount;
        idCount++;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id " + id + ": " + lastName + ' ' + name + ' ' + patronymic + ", отдел: " + department + ", зарплата: " + salary + " руб.";
    }
}
