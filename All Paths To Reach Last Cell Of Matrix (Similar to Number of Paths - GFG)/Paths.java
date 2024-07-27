// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        paths(2, 2, 0, 0, "");
    }
    
    public static void paths(int M, int N, int h, int v, String s) {
        if (h > M || v > N) {
            return;
        }
        
        if (h == M && v == N) {
            System.out.println(s);
            return;
        }
        
        paths(M, N, h + 1, v, s + "H");
        paths(M, N, h, v + 1, s + "V");
    }
}
