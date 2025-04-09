package goldman;

import java.util.Stack;

public class ConstructSmallestNumberFromDIString {

    public static String smallestNumber(String pattern) {
        int n = pattern.length();
        StringBuilder stringBuilder = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        for (int i =0; i <=n; i++) {
           stack.push(i+1);

            if (i == n || pattern.charAt(i) == 'I'){
                while (!stack.isEmpty()){
                    stringBuilder.append(stack.pop());
                }

            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String pattern = "IIIDIDDD";
        System.out.println(smallestNumber(pattern));
    }
}
