class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int rem = target - n;
            if (hm.containsKey(rem)) {
                ans[0] = hm.get(rem);
                ans[1] = i;
                return ans;
            }

            hm.put(nums[i], i);
        }
        return ans;
    }
}