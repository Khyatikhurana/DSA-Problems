class Solution {
    public int maxProfit(int[] prices) {
        int mini = Integer.MAX_VALUE;
        int Profit = 0;

        for(int i = 0; i < prices.length; i++){
            mini = Math.min(mini , prices[i]);
            int diff = prices[i] - mini;
            Profit = Math.max(Profit , diff);
            
        }
        
        return Profit;
    }
}