// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 4
// Output:
// *
// **
// ***
// ****

class Solution8 {
    public void pattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class b_Pattern {
    public static void main(String[] args) {
       Solution8 s = new Solution8();
        s.pattern(4);
    }
}
