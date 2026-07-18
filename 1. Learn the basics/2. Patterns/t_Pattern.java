// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:
// Example 1

// Input: n = 5

// Output:
// *                 * 
// * *             * * 
// * * *         * * * 
// * * * *     * * * * 
// * * * * * * * * * * 
// * * * *     * * * * 
// * * *         * * * 
// * *             * * 
// *                 * 

class Solution26 {
    public void pattern(int n) {

        // Upper half of the pattern
        for (int i = n; i>= 1; i--) {
            for (int j = 1; j <= (n-i)+1; j++) {
                System.out.print("* ");
            }
            for(int k=1; k<=(i*2)-2; k++){
                System.out.print("  ");
            }
            for (int l = 1; l <= (n-i)+1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = 2; i<= n; i++) {
            for (int j = 1; j <= (n-i)+1; j++) {
                System.out.print("* ");
            }
            for(int k=1; k<=(i*2)-2; k++){
                System.out.print("  ");
            }
            for (int l = 1; l <= (n-i)+1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class t_Pattern {
    public static void main(String[] args) {
        Solution26 s = new Solution26();
        s.pattern(6);
    }
}
