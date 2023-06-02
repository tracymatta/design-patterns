public abstract class Store {

    public abstract Pizza createPizza(String type);

    private void makePizza(Pizza p) {
        p.prepare();
        p.bake();
        p.cut();
        p.box();
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        makePizza(pizza);
        return pizza;
    }
}
