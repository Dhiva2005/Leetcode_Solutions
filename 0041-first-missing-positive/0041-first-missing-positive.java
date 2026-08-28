class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Boolean[] arr = new Boolean[n+1];
        for(int i=0;i<=n;i++){
            arr[i] = false;
        }
        for(int num:nums){
            if(num>=0 && num<=n){
                arr[num] = true;
            }
        }
        for(int i=1;i<=n;i++){
            if(!arr[i]){
                return i;
            }
        }
        return n+1;
    }
}