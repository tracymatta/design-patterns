public class PrintVisitor implements OSVisitor {
    
    public void visit(Windows windows) {
        System.out.println("Visiting Windows");
    }

    public void visit(Linux linux) {
        System.out.println("Visiting Linux");
    }

    public void visit(Mac mac) {
        System.out.println("Visiting Mac");
    }
}
