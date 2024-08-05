import java.util.* ;
import java.io.*; 
public class SpiralMatrix {
    public static List<Integer> spiralPathMatrix(int[][] arr, int n, int m) {
        // Write you code here.
        List<Integer> res = new ArrayList<>();

        int left = 0;
        int top = 0;
        int right = m - 1;
        int bottom = n - 1;

        while (left <= right && top <= bottom) {
            //moving right
            for (int i = left; i <= right; i++) {
                res.add(arr[top][i]);
            }
            top++;

            //moving down
            for (int i = top; i <= bottom; i++) {
                res.add(arr[i][right]);
            }
            right--;

            //moving left
            if (bottom >= top) {
                for (int i = right; i >= left; i--) {
                    res.add(arr[bottom][i]);
                }
                bottom--;
            }

            //moving up
            if (right >= left) {
                for (int i = bottom; i >= top; i--) {
                    res.add(arr[i][left]);
                }
                left++;
            }
        }

        return res;
    }
}
