// Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.

// Example 1
// Input: n=5, arr = [1,2,3,4,5]
// Output: [5,4,3,2,1]
// Explanation: The reverse of the array [1,2,3,4,5] is [5,4,3,2,1]

import java.util.Arrays;

class Solution6 {
    public void reverse(int[] arr) {

        int end = arr.length - 1;
        for(int start=0; start<end; start++, end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }
}
public class f_Reverse_the_array {
    public static void main(String[] args) {
        Solution6 s = new Solution6();
        s.reverse(new int[]{1,2,3,4,5});
    }
    
}
