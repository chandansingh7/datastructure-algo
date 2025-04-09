package weekPrep;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        // Write your code here
        Map<Integer, Integer> integerMap = new HashMap<>();
        int resultInt = 0;
        for (Integer values: a) {
            integerMap.put(values, integerMap.getOrDefault(values, 0)+1);
        }

        for (Map.Entry<Integer, Integer> entry: integerMap.entrySet()){
            if (entry.getValue() == 1) {
                 resultInt = entry.getKey();
            }
        }

        return resultInt;
    }

    public static void main(String[] args) {

    }
}
