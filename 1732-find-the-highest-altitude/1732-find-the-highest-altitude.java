class Solution {
    public int largestAltitude(int[] gain) {
        int h = 0;
        int sum = 0;

        for(int num:gain){
            h = h + num;
            if(h>sum){
                sum = h;
            }
        }
        return sum;
    }
}