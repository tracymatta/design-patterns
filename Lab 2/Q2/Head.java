import java.util.ArrayList;

public class Head implements Teacher {
    private String name;
    private String role;
    private ArrayList<Teacher> responsibleOf = new ArrayList<Teacher>();

    public Head(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public int addTeacher(Teacher t) {
        responsibleOf.add(t);
        return 1;
    }

    public int removeTeacher(Teacher t) {
        responsibleOf.remove(t);
        return 1;
    }

    public void printEmployees() {
        for(Teacher t : responsibleOf) {
            if(this.role.equals("Principal")) System.out.print("\t");
            else System.out.print("\t\t");
            t.print();
        }
    }

    public void print() {
        System.out.println(this.name + " is the " + this.role);
    }
}
