//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.floorSqrt(a));
            t--;
        }
    }
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution {
    long floorSqrt(long n) {
        // Your code here
        long start = 1;
        long end = n;
        
        while (start <= end) {
            long mid = (start + end) / 2;
            long val = mid * mid;
            
            if (val <= n) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        
        return end;
    }
}
