class FindValue {
    public static int pascalValue(int r, int c) {
        int ans = 1;
        
        for (int i = 0; i < c; i++) {
            ans = ans * (r - i);
            ans = ans / (i + 1);
        }
        
        return ans;
    }
    
    public static void main(String[] args) {
        int r = 4;
        int c = 2;
        
        System.out.println(pascalValue(r, c));
    }
}
