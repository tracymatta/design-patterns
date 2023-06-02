public class Main {
    public static void main(String[] args) {
        Head principal = new Head("Dr. S.Som", "Principal");
        Head HOM = new Head("Mrs. S.Das", "Hod-Maths");
        Head HOCS = new Head("Mr. V.Sarcar", "Hod-ComputerSc");
        HOM.addTeacher(new MTeacher("Math Teacher-1"));
        HOM.addTeacher(new MTeacher("Math Teacher-2"));
        HOCS.addTeacher(new ITeacher("CSE Teacher-1"));
        ITeacher toRetire = new ITeacher("CSE Teacher-2");
        HOCS.addTeacher(toRetire);
        HOCS.addTeacher(new ITeacher("CSE Teacher-3"));
        principal.addTeacher(HOM);
        principal.addTeacher(HOCS);

        System.out.println("The college has the following structure\n");
        principal.print();
        principal.printEmployees();
        HOM.printEmployees();
        HOCS.printEmployees();

        HOCS.removeTeacher(toRetire);
        System.out.println("\nAfter CSE Teacher-2 leaves the organization, CSE department has the following employees:");
        HOCS.printEmployees();
    }
}
