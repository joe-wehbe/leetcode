class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            if (arr1[cs] != arr2[ct]) return false;

            arr1[cs] = i + 1;
            arr2[ct] = i + 1;
        }

        return true;
    }
}
