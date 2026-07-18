// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 5
// E 
// D E 
// C D E 
// B C D E 
// A B C D E


class Solution24 {
    public void pattern(int n) {
        for(int i=n;i>=1;i--){
            for(char ch=(char)(('A'+i)-1); ch<='A'+n-1; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class r_Pattern {
    public static void main(String[] args) {
        Solution24 s = new Solution24();
        s.pattern(5);
    }
}
