public class Rectangle {

    public double l;
    public double w;

    public double getArea() {
        Calculator calculator = new Calculator();
        return calculator.getArea(this);
    }
}
