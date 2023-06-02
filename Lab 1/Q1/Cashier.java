public class Cashier {
    private Builder builder;

    public Cashier(Builder e) {
        builder = e;
    }

    public Meal getMeal() {
        return this.builder.getMeal();
    }

    public void buildMeal(String burger, String drink, String dessert) {
        this.builder.buildBurger(burger);
        this.builder.buildDrink(drink);
        this.builder.buildDessert(dessert);
    }
}