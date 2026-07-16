// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 4
// 1
// 22
// 333
// 4444

class Solution10 {
    public void pattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class d_Pattern {
    public static void main(String[] args) {
        Solution10 s = new Solution10();
        s.pattern(4);
    }
    
}
