public class MTeacher implements Teacher {
    private String name;

    public MTeacher(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name + " is the MathsTeacher");
    }
}
