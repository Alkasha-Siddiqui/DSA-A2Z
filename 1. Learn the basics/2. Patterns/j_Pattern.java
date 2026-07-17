// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 5
// Output:
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *


class Solution16{
    public void pattern(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=n-1; k>=1; k--){
            for(int l=1; l<=k; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class j_Pattern {
    public static void main(String[] args) {
        Solution16 s = new Solution16();
        s.pattern(5);
    }
}
