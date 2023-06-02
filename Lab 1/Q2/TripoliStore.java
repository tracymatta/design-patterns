public class TripoliStore {

    public Pizza createPizza(String type) {
        Pizza p = null;
        switch(type) {
            case "cheese":
                p = new CheesePizza();
                break;
            case "pepperoni":
                p = new PepperoniPizza();
                break;
            case "greek":
                p = new GreekPizza();
                break;
        }
        p.setCrust("thin");
        return p;
    }
}  

