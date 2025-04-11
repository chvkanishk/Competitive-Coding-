import java.lang.*;

class Solution{
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit =0;

        for(int i=1;i<prices.length;i++){
            if (buy > prices[i]){
                buy= prices[i];
            }
            profit = Math.max(profit,prices[i]-buy);

        }
        return profit;
    }
}
public class sellstocks {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        Solution S = new Solution();

        System.out.println(S.maxProfit(prices));
    }
}
