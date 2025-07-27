class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        if(s.length()!=t.length()) return false;
        
        for(int i =0; i<s.length(); i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(map.containsKey(cs)){
                if(map.get(cs)!= ct) return false;
            }
            else{
                if(set.contains(ct)) return false;
                map.put(cs,ct);
                set.add(ct);
                
            }
        }
        return true;
    }
}