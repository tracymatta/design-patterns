public class Controller {
    private Person[] persons;
    private View view;

    public static void main(String[] args) {
        Controller c = new Controller();
        c.run();
    }

    public Controller() {
        this.persons = new Person[20];
        this.view = new View();
    }

    public void run() {
        while(true) {
            String optionChosen = view.showMenu();
            switch(optionChosen) {
                case "add student":
                    String student = view.addStudent().trim();
                    String[] studentAttributes = student.split(" ", 0);
                    
                    if(studentAttributes.length != 5) {
                        view.showError("Wrong number of attributes!");
                        break;
                    }

                    int flagStudent = 0;
                    for(int i = 2; i < 5; i += 1) {
                        try {
                            Integer.parseInt(studentAttributes[i]);
                        } catch(NumberFormatException e) {
                            view.showError("Wrong attribute types!");
                            flagStudent = 1;
                            break;
                        }
                    }
                    if(flagStudent == 1) break;
                    this.addStudent(student);
                    break;
                case "add teacher":
                    String teacher = view.addTeacher().trim();
                    String[] teacherAttributes = teacher.split(" ", 0);
                    
                    if(teacherAttributes.length != 5) {
                        view.showError("Wrong number of attributes!");
                        break;
                    }
                    
                    int flagTeacher = 0;
                    for(int i = 2; i < 5; i += 2) {
                        try {
                            Integer.parseInt(teacherAttributes[i]);
                        } catch(NumberFormatException e) {
                            view.showError("Wrong attribute types!");
                            flagTeacher = 1;
                            break;
                        }
                    }
                    if(flagTeacher == 1) break;
                    this.addTeacher(teacher);
                    break;
                case "list people":
                    view.listPeople(persons);
                    break;
                case "exit":
                    return;
                default:
                    break;
            }
        }
    }

    public void addStudent(String student) {
        String[] attributes = student.split(" ", 0);
        for(int i = 0; i < this.persons.length; i += 1) {
            if(this.persons[i] == null) {
                this.persons[i] = new Student(attributes[0], attributes[1], Integer.parseInt(attributes[2]), Integer.parseInt(attributes[3]), Integer.parseInt(attributes[4]));
                break;
            }
        }
    }

    public void addTeacher(String teacher) {
        String[] attributes = teacher.split(" ", 0);
        for(int i = 0; i < this.persons.length; i += 1) {
            if(this.persons[i] == null) {
                this.persons[i] = new Teacher(attributes[0], attributes[1], Integer.parseInt(attributes[2]), attributes[3], Integer.parseInt(attributes[4]));
                break;
            }
        }
    }

    public Person[] getPersons() {
        return this.persons;
    } 

    public void setPersons(Person[] persons) {
        this.persons = persons;
    }
}
