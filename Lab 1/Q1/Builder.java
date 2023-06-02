public abstract class Builder {
    protected Meal meal;

    public Builder() {
        meal = new Meal();
    }

    public Meal getMeal() {
        return this.meal;
    }
    
    public abstract void buildBurger(String burger);
    public abstract void buildDrink(String drink);
    public abstract void buildDessert(String dessert);
}
