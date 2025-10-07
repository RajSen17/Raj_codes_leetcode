class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int n = nums[i];
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int maxfreq = 0;
        int maxnum = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>maxfreq){
                maxfreq = entry.getValue();
                maxnum = entry.getKey();
            }
        }
        return maxnum;
        
    }
}