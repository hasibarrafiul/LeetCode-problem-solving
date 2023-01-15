class Solution {
    public int maxProfit(int[] prices) {
       int min = prices[0];
        int sum = 0;
        for(int i=0; i<prices.length;i++){
            if(sum<prices[i]-min)sum=prices[i]-min;
            if(min>prices[i])min=prices[i];
        }
        return sum;
        
    }
}
