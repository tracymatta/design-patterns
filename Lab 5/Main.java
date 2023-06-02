public class Main {
    public static void main(String[] args) {
        OS windows = PlatformFactory.getOperatingSystem("Windows");
        Language language = PlatformFactory.getLanguage("Java", "Windows");
        language.execute("");
        windows.accept(new PrintVisitor());
    }
}
