public class UpperBound {
    public static int upperBound(int []arr, int x, int n){
        // Write your code here.
        int start = 0;
        int end = n - 1;
        int ans = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > x) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }
}
