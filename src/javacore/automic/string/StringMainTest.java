package javacore.automic.string;

public class StringMainTest {

    public static void main(String[] args) {
        if (args == null || args.length == 0 ) {
            System.out.println("<no output>");
        }

        StringBuilder finalSentence = new StringBuilder();
        int len = args.length;

        for (int i=0; i < len-1; ++i) {
            finalSentence.append(args[i]);
            finalSentence.append(" ");
        }
        finalSentence.append (args[len-1]);
        finalSentence.append(".");

        System.out.println(finalSentence.toString());
    }
}
