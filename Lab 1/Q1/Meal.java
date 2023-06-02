public class Meal {
    private String burger = "";
    private String drink = "";
    private String dessert = "";

    public void setBurger(String b) {
        this.burger = b;
    }

    public void setDrink(String d) {
        this.drink = d;
    }

    public void setDessert(String dt) {
        this.dessert = dt;
    }

    @Override
    public String toString() {
        return "Meal has " + this.burger + ", " + this.drink + " and " + this.dessert + ".";
    }
}
