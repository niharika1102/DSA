//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    String line = br.readLine();
		    String[] element = line.trim().split("\\s+");
		    int sizeOfArray = Integer.parseInt(element[0]);
		    int K = Integer.parseInt(element[1]);
		    
		    int arr [] = new int[sizeOfArray];
		    
		    line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    int res = obj.lenOfLongSubarr(arr, sizeOfArray, K);
		    
		    System.out.println(res);
		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution{
    
    // Function for finding maximum and value pair
    public static int lenOfLongSubarr (int arr[], int n, int k) {
        //Complete the function
        
        int maxLen = 0;
        int currSum = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            
            if (currSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            
            if (hm.containsKey(currSum - k)) {
                int len = i - hm.get(currSum - k);
                maxLen = Math.max(len, maxLen);
            }
            if (!hm.containsKey(currSum)) {
                hm.put(currSum, i);
            }
        }
        
        return maxLen;
    }
}