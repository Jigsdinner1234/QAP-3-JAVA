public class CollegeStudent extends Student {
    private final int year;
    private final String major;

    public CollegeStudent(String name, int age, String gender, String studentID, double gpa, int year, String major) {
        super(name, age, gender, studentID, gpa);
        this.year = year;
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + year + ", " + major;
    }
}