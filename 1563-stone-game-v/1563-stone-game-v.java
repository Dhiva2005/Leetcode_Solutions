class Solution {
    public int stoneGameV(int[] stoneValue) {
        int n = stoneValue.length;
        int[][] dp = new int[n][n];

        for(int[] num:dp){
            Arrays.fill(num,-1);
        }

        int[] prefix = new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1] = prefix[i] + stoneValue[i];
        }

        return solve(stoneValue,0,stoneValue.length-1,dp, prefix);
    }
    int solve(int[] arr,int l,int r,int[][] dp,int[] prefix){
        if(l==r) return 0;
        int ans = 0;

        if(dp[l][r] !=-1){
            return dp[l][r];
        }

        for(int k=l;k<r;k++){
            
            int leftSum = prefix[k+1] - prefix[l];
            int rightSum = prefix[r+1] - prefix[k+1];

            int currentScore;

            if(leftSum<rightSum){
                currentScore = leftSum + solve(arr,l,k,dp,prefix);
            }
            else if(rightSum<leftSum){
                currentScore = rightSum + solve(arr,k+1,r,dp,prefix);
            }
            else{
                currentScore = Math.max(leftSum + solve(arr,l,k,dp,prefix),rightSum + solve(arr,k+1,r,dp, prefix));
            }
            ans = Math.max(ans,currentScore);
        }
        return dp[l][r] = ans;
    }
}