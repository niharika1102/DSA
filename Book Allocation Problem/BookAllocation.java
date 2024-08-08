import java.util.*;
public class BookAllocation {
    public static int getStudents(int pages, ArrayList<Integer> arr) {
        int students = 1;
        int pagesPerStudent = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (pagesPerStudent + arr.get(i) <= pages) {
                pagesPerStudent += arr.get(i);
            } 
            else {
                students++;
                pagesPerStudent = arr.get(i);
            }
        }

        return students;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if (m > n) {
            return -1;
        }

        int start = Collections.max(arr);
        int end = 0;

        for (int i = 0; i < n; i++) {
            end += arr.get(i);
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            int students = getStudents(mid, arr);

            if (students <= m) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return start;
    }
}
