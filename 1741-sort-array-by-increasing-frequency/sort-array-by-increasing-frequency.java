class Solution {
    public int[] frequencySort(int[] nums) {
        int l = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n: nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        Integer temp[] = new Integer[l];
        for (int i = 0; i < l; i++) {
            temp[i] = nums[i];
        }

        Arrays.sort(temp, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (freq.get(a) == freq.get(b)) {
                    return b - a;
                }
                return freq.get(a) - freq.get(b);
            }
        });

        for (int i = 0; i < l; i++) {
            nums[i] = temp[i];
        }

        return nums;
    }  
}