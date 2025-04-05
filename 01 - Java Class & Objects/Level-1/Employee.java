class Employee {
    String name;
    int id;
    double salary;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
    }
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "sud";
        e.id = 016;
        e.salary = 299999;
        e.displayDetails();
    }
}
