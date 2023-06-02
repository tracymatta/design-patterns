public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLasttName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void happyBirthday() {
        this.age += 1;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ": " + this.age;
    }
}