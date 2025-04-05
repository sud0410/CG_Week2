class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    void display() {
        System.out.println("IDno: " + employeeID + ", Department: " + department);
    }
    void showSalary() {
        System.out.println("sal: $" + getSalary());
    }
}
class EmployeeRecords {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.employeeID = 16;
        manager.department = "Btech";
        manager.setSalary(25000);
        manager.display();
        manager.showSalary();
    }
}
