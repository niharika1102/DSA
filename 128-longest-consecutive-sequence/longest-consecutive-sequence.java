class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> hs = new HashSet<>();

        for (int n: nums) {
            hs.add(n);
        }

        int maxLen = 0;

        for (int n: nums) {
            if (!hs.contains(n - 1)) {
                int len = 1;

                while (hs.contains(n + len)) {
                    len++;
                }

                maxLen = Math.max(len, maxLen);
            }
        }

        return maxLen;
    }
}