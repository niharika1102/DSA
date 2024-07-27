class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();

        // res.add(genParenthesis(n, 0, 0));
        genParenthesis(n, 0, 0, "", res);

        return res;
    }

    public static void genParenthesis(int n, int open, int close, String s, List<String> res) {
        if (open > n || close > n || close > open) {
            return ;
        }

        if (open == n && close == n) {
            res.add(s);
            return;
        }
        
        genParenthesis(n, open + 1, close, s + "(", res);
        genParenthesis(n, open, close + 1, s + ")", res);
    }
}