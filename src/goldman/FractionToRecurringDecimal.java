package goldman;

import java.util.HashMap;

public class FractionToRecurringDecimal {

    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        if (denominator == 0) return "Undefined";

        StringBuilder result = new  StringBuilder();

        if (numerator<0 ^ denominator<0) result.append("-");

        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        result.append(num/den);
        long reminder = num%den;

        if (reminder == 0) return result.toString();

        result.append(".");
        HashMap<Long, Integer> map = new HashMap<>();

        while (reminder != 0) {
            if (map.containsKey(reminder)) {
                result.insert(map.get(reminder), "(");
                result.append(")");
                break;
            }

            map.put(reminder, result.length());
            reminder *= 10;
            result.append(reminder/den);
            reminder %= den;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(4,333));
    }
}
