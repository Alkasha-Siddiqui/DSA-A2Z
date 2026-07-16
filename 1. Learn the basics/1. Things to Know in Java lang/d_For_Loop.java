// Given two integers low and high, return the sum of all integers from low to high inclusive.

// Example 1
// Input: low = 1, high = 5
// Output: 15
// Explanation: 1 + 2 + 3 + 4 + 5 = 15


class Solution4{
    public int forloop(int low, int high){
        int sum=0;
        for(int i=low; i<=high; i++){
            sum += i;
        }
        return sum;
    }
}

public class d_For_Loop {
    public static void main(String[] args) {
        Solution4 s = new Solution4();
        System.out.print(s.forloop(1, 5));
    }
}
