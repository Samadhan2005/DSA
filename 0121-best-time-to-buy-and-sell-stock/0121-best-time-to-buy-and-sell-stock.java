class Solution {
    public int maxProfit(int[] prices) {
       int maxprofit=0;
       int buystock=prices[0];

       for(int i=1;i<prices.length;i++){
        if(prices[i]>buystock){
            maxprofit=Math.max(maxprofit,prices[i]-buystock);
        }
        buystock=Math.min(buystock,prices[i]);
       } 
       return maxprofit;
    }
}