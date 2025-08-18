import java.util.*;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerset = new ArrayList<>();
        int numberOfSubsets = 1 << nums.length;  // 2^n

        for (int mask = 0; mask < numberOfSubsets; mask++) {
            List<Integer> subset = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if ((mask & (1 << i)) != 0) {
                    subset.add(nums[i]);
                }
            }
            powerset.add(subset);
        }

        return powerset;
    }
}
