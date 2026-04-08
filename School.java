class School {
    String schoolName;
    String location;
    int numberOfStudents;
    int numberOfTeachers;
    String principalName;
    boolean hasPlayground;
    boolean hasLibrary;
    int establishedYear;
    double tuitionFee;
    String schoolType;

    static String country = "India";
    static String serviceType = "Education";

    public String enrollStudent(String studentName) {
        System.out.println("Student Enrolled: " + studentName);
        return studentName;
    }

    public String assignTeacher(String teacherName) {
        System.out.println("Teacher Assigned: " + teacherName);
        return teacherName;
    }

    public boolean conductExam(boolean status) {
        System.out.println("Exam Conducted: " + status);
        return status;
    }

    public double collectFee(double amount) {
        System.out.println("Fee Collected: " + amount);
        return amount;
    }

    public boolean maintainDiscipline(boolean status) {
        System.out.println("Discipline Maintained: " + status);
        return status;
    }

    public String organizeEvent(String eventName) {
        System.out.println("Event Organized: " + eventName);
        return eventName;
    }

    public boolean openSchool(boolean status) {
        System.out.println("School Open: " + status);
        return status;
    }

    public int calculateTotalStudents(int total) {
        System.out.println("Total Students: " + total);
        return total;
    }

    public boolean conductAssembly(boolean status) {
        System.out.println("Assembly Conducted: " + status);
        return status;
    }

    public String announceHoliday(String holiday) {
        System.out.println("Holiday Announced: " + holiday);
        return holiday;
    }
}