// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 4
// *****
// *****
// *****
// *****

class Solution7 {
    public void pattern(int n) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class a_Pattern {
    public static void main(String[] args) {
        Solution7 s = new Solution7();
        s.pattern(4);
    }
}
