class Solution {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");    //remove spaces and create string type array
        String res = "";

        for (int i = str.length - 1; i > 0; i--) {   //traverse from backward direction
            res += str[i] + " ";
        }

        res += str[0];   //add first element of array because we dont want a space
        return res;
    }
}