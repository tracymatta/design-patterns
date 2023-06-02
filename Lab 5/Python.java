public class Python extends Language {
    
    public Python(OS operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void execute(String code) {
        System.out.println("Executing python code on " + this.operatingSystem);
    }
}
