public class CheesePizza extends Pizza {

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void prepare() {
        System.out.println("Preparing cheese pizza with " + this.crust + " crust");
    }

    public void bake() {
        System.out.println("Baking cheese pizza with " + this.crust + " crust");
    }

    public void cut() {
        System.out.println("Cutting cheese pizza with " + this.crust + " crust");
    }

    public void box() {
        System.out.println("Boxing cheese pizza with " + this.crust + " crust");
    }
}
