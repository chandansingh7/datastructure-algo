package patterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringLength3 {

    public static int lengthOfLongestSubstring(String s) {

        int result = 0;
        Map<Character, Integer> integerMap = new HashMap<>();
        int start = 0;

        for (int end =0; end<s.length();end++){
            char ch = s.charAt(end);

            if (integerMap.containsKey(ch) && integerMap.get(ch) >= start){
                start = integerMap.get(ch) + 1;
            }
            integerMap.put(ch, end);
            result = Math.max(result, end-start+1);
        }

        return result;
    }

    public static void main(String[] args) {

    }

}
