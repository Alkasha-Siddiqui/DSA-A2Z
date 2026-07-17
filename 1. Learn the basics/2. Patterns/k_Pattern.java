// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 5
// Output:
// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1

class Solution17 {
    public void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2==0)
                    System.out.print( "1" + " ");
                else
                System.out.print( "0" + " ");
            }
            System.out.println();
        }
    }
}



public class k_Pattern {
    public static void main(String[] args) {
        Solution17 s = new Solution17();
        s.pattern(5);
    }
}
