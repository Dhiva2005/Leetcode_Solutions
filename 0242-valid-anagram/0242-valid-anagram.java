class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        if (s.length() != t.length()) {
            return false;
        }

        for(char c:arr){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i=0;i<t.length();i++){
            char ch  =t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)==0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}