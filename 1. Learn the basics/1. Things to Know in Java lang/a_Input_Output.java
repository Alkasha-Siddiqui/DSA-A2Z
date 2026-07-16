import java.util.Scanner;

class Solution {
    public void printNumber(Scanner sc) {
        int number = sc.nextInt();
        System.out.print(number);
    }
}

class a_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();
        s.printNumber(sc);
        sc.close();
    }
}