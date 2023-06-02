public class Main {
    static public void main(String[] args) {
        Builder b = new Kids();
        Cashier c = new Cashier(b);
        c.buildMeal("burger", "soda", "cupcake");
        System.out.println(c.getMeal().toString());
    }
}
