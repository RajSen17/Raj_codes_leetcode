class Solution {
    public boolean reorderedPowerOf2(int n) {
        List<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            powers.add(1 << i); // 2^i
        }

        String numStr = String.valueOf(n);
        int length = numStr.length();
        Map<Character, Integer> realCount = new HashMap<>();

        // Count frequency of digits in n
        for (char c : numStr.toCharArray()) {
            realCount.put(c, realCount.getOrDefault(c, 0) + 1);
        }

        // Filter powers of 2 with same length
        List<Integer> possible = new ArrayList<>();
        for (int power : powers) {
            if (String.valueOf(power).length() == length) {
                possible.add(power);
            }
        }

        // Check digit counts for each possible power of 2
        for (int power : possible) {
            Map<Character, Integer> checkCount = new HashMap<>();
            for (char c : String.valueOf(power).toCharArray()) {
                checkCount.put(c, checkCount.getOrDefault(c, 0) + 1);
            }
            if (checkCount.equals(realCount)) {
                return true;
            }
        }
        return false;
    }
}
