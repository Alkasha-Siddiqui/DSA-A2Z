// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 5
// Output:
// 1        1
// 12      21
// 123    321
// 1234  4321
// 1234554321


class Solution18 {
    public void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int k=1; k<=(n-i)*2; k++){
                System.out.print(" ");
            }
            for(int l=i;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}

public class l_Pattern {
    public static void main(String[] args) {
        Solution18 s = new Solution18();
        s.pattern(5);
    }
}
