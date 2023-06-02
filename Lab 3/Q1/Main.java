public class Main {
    
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.l = 10;
        r.w = 5;
        System.out.println(r.getArea() + "");

        Triangle t = new Triangle(10, 5);
    
        System.out.println(t.getArea() + "");
    }
}
