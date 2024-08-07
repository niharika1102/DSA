class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        if (nums.length < 3) {
            return ans;
        }

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int need = -1 * (nums[i] + nums[j]);

                if (hm.containsKey(need) && hm.get(need) > j) {
                    ans.add(Arrays.asList(need, nums[i], nums[j]));
                }
                j = hm.get(nums[j]);
            }
            i = hm.get(nums[i]);
        }

        return ans;
    } 
}