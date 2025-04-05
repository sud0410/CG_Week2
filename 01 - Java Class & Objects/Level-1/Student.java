class Student {
    String name;
    int rollNumber;
    int marks;
    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "F";
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "sud";
        s.rollNumber = 016;
        s.marks = 93;
        s.displayDetails();
    }
}
