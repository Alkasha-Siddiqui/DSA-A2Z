
class Solution21 {
    public void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (char ch = 'A'; ch <= ('A' + i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class o_Pattern {
    public static void main(String[] args) {
        Solution21 s = new Solution21();
        s.pattern(5);
    }
}
