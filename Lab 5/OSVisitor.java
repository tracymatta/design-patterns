public interface OSVisitor {

    public void visit(Windows windows);
    public void visit(Linux linux);
    public void visit(Mac mac);
}
