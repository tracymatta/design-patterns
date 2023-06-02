import java.util.Scanner;

public class View {
    public String showMenu() {
        System.out.println("Choose an option from the ones below:\n\"add student\" - add a student\n\"add teacher\" - add a teacher\n\"list people\" - list the people\n\"exit\" - exit the program");
        Scanner s = new Scanner(System.in);
        String choice = s.nextLine();
        //s.close();
        return choice;
    }

    public String addStudent() {
        System.out.println("Input the characteristics of a student on one line separated by spaces:\nExample: firstname lastname age ID grade");
        Scanner s = new Scanner(System.in);
        String studentAttributes = s.nextLine();
        //s.close();
        return studentAttributes;
    }

    public String addTeacher() {
        System.out.println("Input the characteristics of a teacher on one line separated by spaces:\nExample: firstname lastname age classroom salary");
        Scanner s = new Scanner(System.in);
        String teacherAttributes = s.nextLine();
        //s.close();
        return teacherAttributes;
    }

    public void listPeople(Person[] persons) {
        int counter = 0;
        for(Person person : persons) {
            if(person != null) {
                System.out.println(counter + ") " + person);
                counter += 1;
            }
        }
    }

    public void showError(String error) {
        System.out.println("Error: " + error);
    }

    
}
