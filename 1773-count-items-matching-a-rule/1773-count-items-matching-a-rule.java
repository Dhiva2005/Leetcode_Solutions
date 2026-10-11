class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int ind = 0;

        if(ruleKey.equals("color")){
            ind = 1;
        }else if(ruleKey.equals("name")){
            ind = 2;
        }

        for(List<String> item:items){
            if(item.get(ind).equals(ruleValue)){
                count++;
            }
        }

        return count;
    }
}