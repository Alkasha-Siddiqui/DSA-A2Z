// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// Example 1
// Input: n = 4
// Output:
// 1
// 12
// 123
// 1234

class Solution9 {
    public void pattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class c_Pattern {
    public static void main(String[] args) {
        Solution9 s = new Solution9();
        s.pattern(4);
    }
}
