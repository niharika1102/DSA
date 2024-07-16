import java.util.*;

public class Solution {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.

        //Brute force
        // int n = arr.size();
        // ArrayList<Integer> temp = new ArrayList<>();
        // for (int i = 0; i < k; i++) {
        //     temp.add(arr.get(i));
        // }

        // for (int i = k; i < n; i++) {
        //     arr.set(i - k, arr.get(i));
        // }

        // int j = 0;
        // for (int i = n - k; i < n; i++) {
        //     arr.set(i, temp.get(j));
        //     j++;
        // }

        // return arr;

        //Optimal appraoch
        int n = arr.size();
        k = k % n;

        if (k == 0) {
            return arr;
        }

        Collections.reverse(arr.subList(0, k));
        Collections.reverse(arr.subList(k, n));
        Collections.reverse(arr);

        return arr;
    }
}
