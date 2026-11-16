public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int benefit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
            int currentBenefit = prices[i] - minPrice;
            if (benefit < currentBenefit) {
                benefit = currentBenefit;
            }
        }
        return benefit;
    }
}
