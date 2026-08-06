class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int count = 0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                count = Math.max(count,prices[r]-prices[l]);
            }
            else{
                l=r;
            }
            r++;
        }
        return count;
    }
}