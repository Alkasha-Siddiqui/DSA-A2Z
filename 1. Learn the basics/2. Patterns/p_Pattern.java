// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 4
// Output:
// A
// B B
// C C C
// D D D D


class Solution22 {
    public void pattern(int n) {
        for (char ch='A'; ch <= ('A'+n)-1; ch++) {
            for (int j = 1; j <= ch-'A'+1; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class p_Pattern {
    public static void main(String[] args) {
        Solution22 s = new Solution22();
        s.pattern(5);
    }
}
