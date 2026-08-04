class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
            set.add(num);
        }
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}