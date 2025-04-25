class Solution {

    public int count(int[] nums,int goal){
        
        int r=0,sum=0,ans=0,n=nums.length;
        if(goal<0) return 0;

        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>goal){
                sum-=nums[r++];
            }
            ans+=i-r+1;
        }
        return ans;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
        return (count(nums,goal) - count(nums,goal-1));
    }
}