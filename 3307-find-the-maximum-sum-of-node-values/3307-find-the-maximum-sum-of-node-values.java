public class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long totalSum = 0;
        int count = 0;
        int minDiff = Integer.MAX_VALUE;

        for (int num : nums) {
            int xorVal = num ^ k;
            totalSum += Math.max(num, xorVal);
            if (xorVal > num) {
                count++;
                minDiff = Math.min(minDiff, xorVal - num);
            } else {
                minDiff = Math.min(minDiff, num - xorVal);
            }
        }
        if (count % 2 == 0) {
            return totalSum;
        } else {
            return totalSum - minDiff;
        }
    }
}
