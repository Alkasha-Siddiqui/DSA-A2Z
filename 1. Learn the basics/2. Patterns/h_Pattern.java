// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 5
// Output:
// *********
//  *******
//   *****
//    ***
//     *


class Solution14 {
    public void pattern(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class h_Pattern {
    public static void main(String[] args) {
        Solution14 s = new Solution14();
        s.pattern(5);
    }
}
