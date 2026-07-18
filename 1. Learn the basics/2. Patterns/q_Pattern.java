// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 5
// Output:
//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA


class Solution23{
    public void pattern(int n) {
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(char ch='A'; ch<=('A'+i)-1; ch++){
                System.out.print(ch);
            }
            for(char ch=(char) (('A'+i)-2); ch>='A'; ch--){
                System.out.print(ch);
            }

            System.out.println();
        }
    }
}

public class q_Pattern {
    public static void main(String[] args) {
        Solution23 s = new Solution23();
        s.pattern(4);
    }
}
