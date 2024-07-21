class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sumArr = 0;

        for (int i = 0; i < n + 1; i++) {
            sum += i;
        }

        for (int i = 0; i < n; i++) {
            sumArr += nums[i];
        }

        Arrays.sort(nums);

        if (sum - sumArr == 0) {
            if (nums[0] != 0) {
                return 0;
            }
            else {
                return n;
            }
        }
        return sum - sumArr;
    }
}