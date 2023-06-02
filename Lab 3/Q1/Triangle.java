public class Triangle {

    public double b;
    public double h;

    public Triangle(int b, int h) {
        this.b = b;
        this.h = h;
    }

    public double getArea() {
        ShapeAdapter adapter = new ShapeAdapter();
        Calculator calculator = new Calculator();
        return calculator.getArea(adapter.getRectangle(this.b, this.h)) / 2;
    }
}
