public abstract class Pizza {
    protected String crust = "";
    
    public abstract void setCrust(String crust);
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();
    public abstract void box();
}
