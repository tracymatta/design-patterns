public class Student extends Person {
    private int studentID;
    private int gradeLevel;

    public Student(String firstName, String lastName, int age, int studentID, int gradeLevel) {
        super(firstName, lastName, age);
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
    }

    public int getStudentID() {
        return this.studentID;
    }

    public int getGradeLevel() {
        return this.gradeLevel;
    }

    @Override
    public void happyBirthday() {
        super.happyBirthday();
        this.gradeLevel += 1;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.studentID + " - " + this.gradeLevel + ")";
    }
}
