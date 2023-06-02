public class ITeacher implements Teacher {
    private String name;

    public ITeacher(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(this.name + " is the CSETeacher");
    }
}
