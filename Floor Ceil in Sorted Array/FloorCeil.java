import java.util.* ;
import java.io.*; 

public class FloorCeil {
  public static int getFloor(int arr[], int n, int x) {
    int ele = -1;
    int start = 0;
    int end = n - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] <= x) {
        ele = arr[mid];
        start = mid + 1;
      }
      else {
        end = mid - 1;
      }
    }

    return ele;
  }

  public static int getCeil(int arr[], int n, int x) {
    int ele = -1;
    int start = 0;
    int end = n - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] >= x) {
        ele = arr[mid];
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }

    return ele;
  }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
      // Wriute your code here.

      int floor = getFloor(a, n, x);
      int ceil = getCeil(a, n, x);

      int ans[] = {floor, ceil};

      return ans;
    }
    
}
