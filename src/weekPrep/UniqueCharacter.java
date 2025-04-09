package weekPrep;

import java.util.Set;
import java.util.TreeSet;

public class UniqueCharacter {


    public static String uniqueChars(String str1, String str2) {
        String combined = "";
        combined = str1.concat(str2);
        Set<Character> charSet = new TreeSet<>();

        for (char character: combined.toCharArray()) {
            charSet.add(character);
        }

        StringBuilder sb = new StringBuilder();

        for (Character ch: charSet) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str1 = "chandan";
        String str2 = "narayan";
        System.out.println(uniqueChars( str1, str2));
    }
}
