//Used a hashmap to track frequency of each element and stored it in the given array finally.

class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int n, int p)
    {
        // code here
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            }
            else {
                hm.put(arr[i], 1);
            }
        }
        
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(i + 1)) {
                arr[i] = hm.get(i + 1);
            }
            else {
                arr[i] = 0;
            }
        }
    }
}
