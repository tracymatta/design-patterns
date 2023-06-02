import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String line = s.nextLine();
        s.close();
        char[] c = line.toCharArray();
        for (int i = 0; i < c.length; i++) {
            Letters l = (Letters)LetterFactory.getLetter(c[i]);
            if(Character.isUpperCase(c[i])) System.out.print(Character.toUpperCase(l.getletter()));
            else System.out.print(l.getletter()); 
        }
    }
}
