class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> list = new LinkedList<>();
        for(int i=0;i<n-1;i++){
            while(nums[i]+1<nums[i+1]){
                list.add(++nums[i]);
            }
        }
        
        return list;
    }
}