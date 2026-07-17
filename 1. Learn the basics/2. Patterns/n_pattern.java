// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 4
// Output:
// A
// AB
// ABC
// ABCD


class Solution20{
    public void pattern(int n){
        for(int i=1; i<=n; i++){
            for(char ch='A'; ch<=('A'+i-1); ch++){
              System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class n_pattern {
    public static void main(String[] args) {
        Solution20 s = new Solution20();
        s.pattern(4);
    }
}
