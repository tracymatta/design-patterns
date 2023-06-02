import java.util.ArrayList;

public class Parent implements Tag{

    private String start;
    private String end;
    private ArrayList<Tag> body = new ArrayList<Tag>();

    public Parent(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public int addChild(Tag t) {
        body.add(t);
        return 1;
    }

    public int removeChild(Tag t) {
        body.remove(t);
        return 1;
    }

    public ArrayList<Tag> getChildren() {
        return body;
    }

    public void display(int nbOfTabs) {
        for(int i = 0; i < nbOfTabs; i += 1) {
            System.out.print("\t");
        } 
        System.out.println(this.start);
        for (Tag tag : body) {
            tag.display(nbOfTabs + 1);
        }
        for(int i = 0; i < nbOfTabs; i += 1) {
            System.out.print("\t");
        } 
        System.out.println(this.end);
    }
}
