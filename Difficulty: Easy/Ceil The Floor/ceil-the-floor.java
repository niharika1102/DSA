//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
        int ceil = Integer.MAX_VALUE;
        int floor = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                floor = Math.max(floor, arr[i]);
            }
            
            if (arr[i] >= x) {
                ceil = Math.min(ceil, arr[i]);
            }
        }
        
        int ans[] = new int[2];
        
        ans[0] = floor;
        
        if (ceil == Integer.MAX_VALUE) {
            ans[1] = -1;
        }
        else {
            ans[1] = ceil;
        }
        
        return ans;
    }
}
