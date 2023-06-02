public class GreekPizza extends Pizza {

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public void prepare() {
        System.out.println("Preparing greek pizza with " + this.crust + " crust");
    }

    public void bake() {
        System.out.println("Baking greek pizza with " + this.crust + " crust");
    }

    public void cut() {
        System.out.println("Cutting greek pizza with " + this.crust + " crust");
    }

    public void box() {
        System.out.println("Boxing greek pizza with " + this.crust + " crust");
    }
}
