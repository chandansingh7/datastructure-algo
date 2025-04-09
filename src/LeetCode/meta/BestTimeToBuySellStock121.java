package LeetCode.meta;

public class BestTimeToBuySellStock121 {

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price: prices){

             minPrice = Math.min(minPrice, price);
                        System.out.println(minPrice);
            maxProfit = Math.max(maxProfit, price-minPrice);
                        System.out.println(maxProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
