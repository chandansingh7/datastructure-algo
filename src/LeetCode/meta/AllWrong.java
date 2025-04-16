package LeetCode.meta;

public class AllWrong {

    public static String getWrongAnswers(int N, String C) {
        // Write your code here
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            if ( C.charAt(i) == 'A' ){
                sb.append("B");
            }else {
                sb.append("A");
            }

        }


        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getWrongAnswers(5, "BBBBB"));
    }
}
