package SlidingWindow;

public class BestTimeToBuySell {
    
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int maxi = 0;
        for(int i=1;i<n;i++){
            maxi = Math.max(maxi , prices[i]-min);
            min = Math.min(min , prices[i]);
        }
        return maxi;
    }
}
