import java.util.HashMap;

public class PlatformFactory {

    private static final HashMap<Pair<String, String>, Language> languages = new HashMap<Pair<String, String>, Language>();
    private static final HashMap<String, OS> operatingSystems = new HashMap<String, OS>();

    public static OS getOperatingSystem(String operatingSystem) {
        OS system = (OS) operatingSystems.get(operatingSystem);
        if(system == null) {
            switch(operatingSystem) {
                case "Windows":
                    system = new Windows();
                    break;
                case "Linux":
                    system = new Linux();
                    break;
                case "Mac":
                    system = new Mac();
                    break;
            }
            operatingSystems.put(operatingSystem, system);
            System.out.println("Created new " + operatingSystem + " operating system");
        }
        return system;
    }

    public static Language getLanguage(String language, String operatingSystem) {
        Pair<String, String> values = Pair.of(language, operatingSystem); 
        Language platform = (Language) languages.get(values);
        if(platform == null) {
            OS system = getOperatingSystem(operatingSystem);
            switch(language) {
                case "Java":
                    platform = new Java(system);
                    break;
                case "Python":
                    platform = new Python(system);
                    break;
                case "PHP":
                    platform = new PHP(system);
                    break;
            }
            languages.put(values, platform);
            System.out.println("Created new " + language + " platform with " + operatingSystem + " operating system");
        }
        return platform;
    }
}
