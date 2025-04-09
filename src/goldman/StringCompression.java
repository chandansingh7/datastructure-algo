package goldman;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {

    public static int compress(char[] chars) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character character : chars) {
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return 1;
            }
            else {
                stringBuilder.append(entry.getKey().toString()+entry.getValue().toString());

            }
        }

        System.out.println(stringBuilder.toString().toCharArray());
//        System.out.println(new char[] {stringBuilder.toString());
        return stringBuilder.length();
    }

    public static int compresser(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }

            chars[index++] = currentChar;

            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index;

    }

    public static int compresserCustom(char[] chars){
        int start=0, index= 0;

        while (start < chars.length) {
            int end = start;
            while (end < chars.length && chars[start] == chars[end]) {
                end++;
            }
            int count = end - start;
            chars[index++] = chars[start];

            if (count >= 2) {
                char[] frequency = Integer.toString(count).toCharArray();
                for (char ch: frequency) {
                    chars[index++] = ch;
                }
            }
            start = end;
        }

        return index;
    }

    public static void main(String[] args) {
        char [] chars= new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compresserCustom(chars));
    }
}
