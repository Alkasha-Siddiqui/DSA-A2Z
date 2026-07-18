// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 4
// Output:
// **********
// ****  ****
// ***    ***
// **      **
// *        *
// *        *
// **      **
// ***    ***
// ****  ****
// **********


class Solution25 {
    public void pattern(int n) {
        
        // Upper half of the pattern
        for (int i = 1; i <= n; i++) {
            //Both the below loops are same, just the condition is changed to make it more readable
            // for (int j = n; j >= i; j--) {
            for (int j = 1; j <= (n - i)+1; j++) {
                System.out.print("* ");
            }
            for(int k=1; k<=(i*2)-2; k++){
                System.out.print("  ");
            }
            //Both the below loops are same, just the condition is changed to make it more readable
            // for (int l = n; l >= i; l--) {
            for(int l = 1; l <= (n - i)+1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= (n - i)+1; j++) {
                System.out.print("* ");
            }
            for(int k=1; k<=(i*2)-2; k++){
                System.out.print("  ");
            }
            for (int l = 1; l <= (n - i)+1; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class s_Pattern {
    public static void main(String[] args) {
        Solution25 s = new Solution25();
        s.pattern(5);
    }
}
