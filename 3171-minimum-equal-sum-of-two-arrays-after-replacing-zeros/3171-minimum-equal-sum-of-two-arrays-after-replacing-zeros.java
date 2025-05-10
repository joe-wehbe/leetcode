class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        int zero1 = 0;
        int zero2 = 0;

        for (int num : nums1) {
            if (num == 0) {
                sum1 += 1;
                zero1++;
            } else sum1 += num;
        }

        for (int num : nums2) {
            if (num == 0) {
                sum2 += 1;
                zero2++;
            } else sum2 += num;
        }

        if ((sum1 > sum2 && zero2 == 0) || (sum2 > sum1 && zero1 == 0)) return -1;
        return sum1 > sum2 ? sum1 : sum2;
    }
}