class Solution {
    public static int startIndex(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                end = mid - 1;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static int endIndex(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                ans = mid;
                start = mid + 1;
            }

            else if (arr[mid] < target) {
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        int start = startIndex(nums, target);
        int end = endIndex(nums, target);

        int ans[] = {start, end};
        return ans;
    }
}