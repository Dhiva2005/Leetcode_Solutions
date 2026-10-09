class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int rs = 0;
            for(int j =0;j<accounts[i].length;j++){
                rs += accounts[i][j];
            }
            sum = Math.max(sum,rs);
        }
        return sum;
    }
}