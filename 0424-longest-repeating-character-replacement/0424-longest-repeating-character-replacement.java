class Solution {
    public int characterReplacement(String s, int k) {
        int wstart = 0;
        int res = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int maxrep = 0;
        for(int wend = 0; wend < s.length();wend++) {
            char ch = s.charAt(wend);
            int rep = 0;
            if (!hashMap.containsKey(ch)) {
                hashMap.put(ch, 1);
                rep = 1;
            } else {
                rep = hashMap.get(ch)+1;
                hashMap.put(ch, rep);
            }
            maxrep = Math.max(maxrep, rep);
            while (wend-wstart+1-maxrep > k) {
                char rch = s.charAt(wstart);
                int value = hashMap.get(rch)-1;
                if(value == 0) {
                    hashMap.remove(rch);
                } else {
                    hashMap.put(rch, value);
                }
                wstart += 1;
            }
            res = Math.max(res, wend-wstart+1);
        }
        return res;
    }
}