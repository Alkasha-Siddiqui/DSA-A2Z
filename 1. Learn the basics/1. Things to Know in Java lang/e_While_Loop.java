// Given a digit d (0 to 9), find the sum of the first 50 positive integers (integers > 0) that end with digit d.
// A number ends with digit d if its last digit is d.

// Example 1
// Input: d = 1
// Output: 12300
// Explanation:
// The first 50 positive integers ending with 1 are: 1, 11, 21, 31, ..., 491
// Their sum is 12300.


class Solution5{
    public int whileloop(int d){
        int sum=0;
        int count=0;
        while(count<50){
            sum = sum + d;
            d = d+10;
            count++;
        }
        return sum;
    }
}

public class e_While_Loop {
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.print(s.whileloop(1));
    }
}
