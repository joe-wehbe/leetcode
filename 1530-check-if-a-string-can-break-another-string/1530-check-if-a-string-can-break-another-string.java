class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        int n = s1.length();
        char[] nums1 = s1.toCharArray();
        char[] nums2 = s2.toCharArray();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        return canBreaks(nums1, nums2) || canBreaks(nums2, nums1);
    }

    private boolean canBreaks(char[] nums1, char[] nums2) {
        for (int i = 0; i < nums1.length; i++) 
            if (nums1[i] < nums2[i]) return false;

        return true;
    }
}