// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 4
// Output:
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 


class Solution19 {
    public void pattern(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

public class m_Pattern {
    public static void main(String[] args) {
        Solution19 s = new Solution19();
        s.pattern(4);
    }
}
