public class Main {
    public static void main(String[] args) {
        Parent xmlTag = new Parent("<?xml version = \"1.0\"?>", "");
        Parent classTag = new Parent("<class>", "</class>");
        Parent studentTag1 = new Parent("<parent>", "</parent>");
        Parent studentTag2 = new Parent("<parent>", "</parent>");

        studentTag1.addChild(new Child("<fistname>", "Ahmad", "</firstname>"));
        studentTag1.addChild(new Child("<lastname>", "Youssef", "</lastname>"));
        studentTag1.addChild(new Child("<ID>", "LB1234", "</ID>"));
        studentTag1.addChild(new Child("<marks>", "85", "</marks>"));

        classTag.addChild(studentTag1);

        studentTag2.addChild(new Child("<fistname>", "Mark", "</firstname>"));
        studentTag2.addChild(new Child("<lastname>", "Ghostina", "</lastname>"));
        studentTag2.addChild(new Child("<ID>", "LB1235", "</ID>"));
        studentTag2.addChild(new Child("<marks>", "95", "</marks>"));

        classTag.addChild(studentTag2);

        xmlTag.addChild(classTag);

        xmlTag.display(-1);

    } 
}
