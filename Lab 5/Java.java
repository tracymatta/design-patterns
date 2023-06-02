public class Java extends Language {

    public Java(OS operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void execute(String code) {
        System.out.println("Executing java code on " + this.operatingSystem);
    }
}

