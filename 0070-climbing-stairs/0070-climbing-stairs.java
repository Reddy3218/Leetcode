class Solution {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        int i = 3;
        while (i <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            i++;
        }
        return b;
    }
}
