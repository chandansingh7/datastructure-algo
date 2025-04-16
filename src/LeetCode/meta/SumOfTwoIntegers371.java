package LeetCode.meta;

public class SumOfTwoIntegers371 {

    public static int getSum(int a, int b) {

        while (b!=0) {
            int carry = a & b;
            System.out.println("carry:" + carry);
            a = a ^ b;
            System.out.println("a:" + a);
            b = carry << 1;
            System.out.println("b:" + b);
        }


        return a;
    }

    public static void main(String[] args) {
        System.out.println(getSum(2, 3));
    }
}
