class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        Integer index[] = new Integer[n];    //Integer because we have to create custom sorting algo

        for (Integer i = 0; i < n; i++) {
            index[i] = i;
        }

        Arrays.sort(index, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return heights[b] - heights[a];
            }
        });

        String res[] = new String[n];
        int i = 0;

        for (Integer in: index) {
            res[i] = names[in];
            i++;
        }

        return res;
    }
}