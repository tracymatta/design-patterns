public class ShapeAdapter {
    
    Rectangle rectangle = new Rectangle();

    public Rectangle getRectangle(double base, double height) {
        this.rectangle.l = base;
        this.rectangle.w = height;
        return rectangle;
    }

}
