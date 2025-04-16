class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;
        while(start<=end){
            if(nums[start]==0){
                swap(nums,start,mid);
                start++;
                mid++;
            }else if(nums[start]==1){
                start++;
            }else if(nums[start]==2){
                swap(nums,start,end);
                end--;
            }
        }

    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}