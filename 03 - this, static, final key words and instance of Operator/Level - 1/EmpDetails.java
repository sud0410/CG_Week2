class Employee {
    static String companyName = "google";
    static int totalEmployees = 0;
    final int id;
    String name, designation;
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    void display() {
        if (this instanceof Employee) {
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
            System.out.println("Company: " + companyName);
        }
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    public static void main(String[] args) {
        Employee e = new Employee("Sudarsan", 01, "janitor");
        e.display();
        Employee.displayTotalEmployees();
    }
}
