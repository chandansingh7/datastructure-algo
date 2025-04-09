package goldman;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static int firstUniqChar1(String s) {
        int[] charCount = new int[26]; // Array for character frequency (only lowercase a-z)

        // First pass: Count occurrences of each character
        for (char ch : s.toCharArray()) {
            charCount[ch - 'a']++;
        }

        // Second pass: Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i=0;i<s.length();i++) {
            if (map.get(s.charAt(i))==1) {
                return i;
            }
        }



        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar1("loveleetcode"));
    }
}
