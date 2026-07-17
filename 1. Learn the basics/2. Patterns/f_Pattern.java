// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 4
// Output:
// 1234
// 123
// 12
// 1


class Solution12 {
    public void pattern(int n) {
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class f_Pattern {
    public static void main(String[] args) {
        Solution12 s = new Solution12();
        s.pattern(4);
    }
}
