class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long count = 0;

        for (int i = 0; i < n; i++) {
            int low = lowerBound(nums, i + 1, n - 1, lower - nums[i]);
            int high = upperBound(nums, i + 1, n - 1, upper - nums[i]);
            count += (high - low + 1);
        }

        return count;
    }

    private int lowerBound(int[] arr, int left, int right, int target) {
        int res = right + 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= target) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }

    private int upperBound(int[] arr, int left, int right, int target) {
        int res = left - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
}
