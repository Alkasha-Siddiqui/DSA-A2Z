// Given an integer n. You need to recreate the pattern given below for any value of N. Let's say for N = 5, the pattern should look like as below:

// Example 1
// Input: n = 5
// Output:
// *****
// *   *
// *   *
// *   *
// *****


class Solution27{
    public void pattern(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=n; j++){
                if(i==1 || j==1 || j==n || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class u_Pattern {
    public static void main(String[] args) {
       Solution27 s = new Solution27();
       s.pattern(5);
    }
}
