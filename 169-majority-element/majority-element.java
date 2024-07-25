class Solution {
    public int majorityElement(int[] nums) {
        //O(n) space
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = nums.length / 2;
        int res = 0;
        
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);

            if (hm.get(nums[i]) > count) {
                res = nums[i];
            }
        }

        return res;
    }
}