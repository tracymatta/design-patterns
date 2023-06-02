public class Linux extends OS {
    
    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public void config() {
        System.out.println("Configuring Linux");
    }

    public void accept(OSVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Linux";
    }
}
