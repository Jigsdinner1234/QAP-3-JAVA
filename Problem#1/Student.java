public class Student extends Person {
    private final String studentID;
    private final double gpa;

    public Student(String name, int age, String gender, String studentID, double gpa) {
        super(name, age, gender);
        this.studentID = studentID;
        this.gpa = gpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + studentID + ", " + gpa;
    }
}
