import java.util.HashMap;

public class LetterFactory {
    private static HashMap<Character, Letters> H = new HashMap<Character, Letters>();

    public static Letters getLetter(char c) {
        Letters l = H.get(c);
        if (l == null) {
            l = new Letters(c);
            H.put(c, l);
        }
        return l;
    }

}
