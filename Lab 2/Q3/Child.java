public class Child implements Tag {

    private String start;
    private String end;
    private String body;

    public Child(String start, String body, String end) {
        this.start = start;
        this.body = body;
        this.end = end;
    }

    public void display(int nbOfTabs) {
        for(int i = 0; i < nbOfTabs; i += 1) {
            System.out.print("\t");
        } 
        System.out.println(this.start + this.body + this.end);
    }
}