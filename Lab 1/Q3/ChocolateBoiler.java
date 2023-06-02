public class ChocolateBoiler {

    private boolean empty;
    private boolean boiled;
    private ChocolateBoiler instance = null;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }    

    public ChocolateBoiler getInstance() {
        if(instance == null) {
            instance = new ChocolateBoiler();
        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }
}
