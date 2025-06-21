class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        int n = s1.length();
        int[] nums1 = new int[n];
        int[] nums2 = new int[n];

        for (int i = 0; i < n; i++) {
            nums1[i] = (int) s1.charAt(i);
            nums2[i] = (int) s2.charAt(i);
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return firstBreaks(nums1, nums2) || secondBreaks(nums1, nums2);
    }

    private boolean firstBreaks(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) 
            if (nums1[i] < nums2[i]) return false;

        return true;
    }

    private boolean secondBreaks(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++)
            if (nums2[i] < nums1[i]) return false;

        return true;
    }
}