public class PepperoniPizza extends Pizza {

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void prepare() {
        System.out.println("Preparing pepperoni pizza with " + this.crust + " crust");
    }

    public void bake() {
        System.out.println("Baking pepperoni pizza with " + this.crust + " crust");
    }

    public void cut() {
        System.out.println("Cutting pepperoni pizza with " + this.crust + " crust");
    }

    public void box() {
        System.out.println("Boxing pepperoni pizza with " + this.crust + " crust");
    }
}
