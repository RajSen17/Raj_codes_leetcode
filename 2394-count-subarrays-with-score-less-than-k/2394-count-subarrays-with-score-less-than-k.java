class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long sum = 0;
        long result = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (sum * (right - left + 1) >= k) {
                sum -= nums[left++];
            }

            result += (right - left + 1);
        }

        return result;
        
    }
}