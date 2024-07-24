class Solution {
    public void sortColors(int[] nums) {
        int k = 0;
        int arr[] = new int[3];

        for (int n: nums) {
            arr[n]++;
        }

        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != 0) {
                nums[k] = i;
                k++;
                arr[i]--;
            }
        }
    }
}