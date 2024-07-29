class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                negative.add(nums[i]);
            }
            else {
                positive.add(nums[i]);
            }
        }

        int arr[] = new int[n];
        int i = 0;
        int j = 0;
        int k = 0;

        while (k < n) {
            arr[k++] = positive.get(i);
            i++;
            arr[k++] = negative.get(j);
            j++;
        }

        return arr;
    }
}