import java.util.*;

class Solution {
    private static final double EPS = 1e-4;

    // Compute all possible results from a and b
    private List<Double> compute(double a, double b) {
        List<Double> results = new ArrayList<>();
        results.add(a + b);
        results.add(a - b);
        results.add(b - a);
        results.add(a * b);
        if (Math.abs(b) > EPS) results.add(a / b);
        if (Math.abs(a) > EPS) results.add(b / a);
        return results;
    }

    // Recursive helper
    private boolean helper(List<Double> nums) {
        if (nums.size() == 1) {
            return Math.abs(nums.get(0) - 24) < EPS;
        }

        int size = nums.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                double x = nums.get(i);
                double y = nums.get(j);

                for (double num : compute(x, y)) {
                    List<Double> next = new ArrayList<>();
                    next.add(num);

                    // Add all unused numbers
                    for (int k = 0; k < size; k++) {
                        if (k != i && k != j) {
                            next.add(nums.get(k));
                        }
                    }

                    if (helper(next)) return true;
                }
            }
        }
        return false;
    }

    public boolean judgePoint24(int[] cards) {
        List<Double> nums = new ArrayList<>();
        for (int card : cards) nums.add((double) card);
        return helper(nums);
    }
}
