import java.util.*;

class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Long> p2 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        int mod = (int) 1e9 + 7;
        int i = 0;

        // Extract powers of 2 present in n's binary form
        while (n > 0) {
            if ((n & 1) == 1) {
                p2.add(1L << i); // store actual power of 2
            }
            n >>= 1;
            i++;
        }

        // Process each query
        for (int[] q : queries) {
            long prod = 1;
            for (int j = q[0]; j <= q[1]; j++) {
                prod = (prod * p2.get(j)) % mod;
            }
            res.add((int) prod);
        }

        // Convert List<Integer> to int[]
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
