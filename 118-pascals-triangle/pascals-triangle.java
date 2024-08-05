class Solution {
    public List<Integer> rows(int row) {
        List<Integer> res = new ArrayList<>();

        int ans = 1;
        res.add(ans);

        for (int i = 1; i < row; i++) {
            ans *= (row - (i - 1));
            ans /= i;

            res.add(ans);
        }

        res.add(1);        
        return res;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> rowOne = new ArrayList<>();
        rowOne.add(1); 
        res.add(rowOne);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = rows(i);
            res.add(row);
        }

        return res;
    }
}