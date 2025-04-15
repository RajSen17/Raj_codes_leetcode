class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length/3;
        for(int rr : nums){
            map.put(rr, map.getOrDefault(rr,0)+1);
        }
        List<Integer> result = new ArrayList();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>n){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}