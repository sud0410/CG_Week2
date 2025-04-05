class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "SRMIST";
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    void displayCourseDetails() {
        System.out.println(courseName + " | time: " + duration + " weeks | Fee: $" + fee + " | Institute: " + instituteName);
    }
    static void updateInstituteName(String newName) {
        instituteName = newName;
    }
    public static void main(String[] args) {
        Course c1 = new Course("JavaProgramming", 6, 200);
        Course c2 = new Course("DataScience", 12, 600);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        updateInstituteName("bridgelabs");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
