class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int fix = 0;
        while(fix<nums.length-1){
            int left = fix+1;
            int right = nums.length-1;
        
        
            while(left<right){
                int sum = nums[fix] + nums[left] + nums[right];
                if(sum==0){
                result.add(Arrays.asList(nums[fix], nums[left], nums[right]));
                left++;
                right--;

                while(left<right && nums[left]==nums[left-1]) left++;
                while(left<right && nums[right]==nums[right+1]) right--;
                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
            fix++;
            while(fix<nums.length-1 && nums[fix]==nums[fix-1]) fix++;
        }
        return result;
    }
}