public class PHP extends Language{

    public PHP(OS operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void execute(String code) {
        System.out.println("Executing php code on " + this.operatingSystem);
    }
}
