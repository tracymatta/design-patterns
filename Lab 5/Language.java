public abstract class Language {

    protected OS operatingSystem;

    protected Language(OS operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public abstract void execute(String code);
}
