class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int n = nums.length;
        if(n==0){
            return new int[]{};
        }
        for(int i=0;i<n;i++){
            int find = target - nums[i];
            if(hash.containsKey(find)){
                return new int[]{hash.get(find),i};
            }
            hash.put(nums[i],i);
        }
        return new int[]{};
    }
}