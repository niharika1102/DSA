class Solution {
    public void moveZeroes(int[] nums) {
        //Brute force
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] == 0) {
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

        //Optimal approach
        int left = 0;

        for (int n: nums) {
            if (n != 0) {
                nums[left] = n;
                left++;
            }
        }

        while (left < nums.length) {
            nums[left] = 0;
            left++;
        }
    }
}