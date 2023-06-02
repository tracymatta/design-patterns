public class Teacher extends Person {
    private String classroom;
    private int salary;

    public Teacher(String firstName, String lastName, int age, String classroom, int salary) {
        super(firstName, lastName, age);
        this.classroom = classroom;
        this.salary = salary;
    }

    public String getClassroom() {
        return this.classroom;
    }

    public int getSalary() {
        return this.salary;
    }

    @Override
    public void happyBirthday() {
        super.happyBirthday();
        this.salary += 1000;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + this.classroom + " - $" + this.salary + ")";
    }
}
