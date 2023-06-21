package topinterview150;

public class Q8_BuyAndSellStock2 {
    public static void main(String[] args) {
        int a[] = {7,1,5,3,6,4};
        Q8_BuyAndSellStock2 obj = new Q8_BuyAndSellStock2();
        obj.maxProfit(a);

    }

    public int maxProfit(int[] prices) {
        int buy = prices[0], total = 0, sell = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = prices[i];
            }else  {
                int profit = prices[i] - buy;
                    int sum = total + profit;
                    if (sum > total) {
                        total = sum;
                    }
                    buy = prices[i];
            }
        }
        System.out.println("total: " + total);
        return total;
    }
}
