class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefix = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int rem = prefix - k;
            
            count += hm.getOrDefault(rem, 0);
            hm.put(prefix, hm.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}