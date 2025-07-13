class Solution {
    public int maximum69Number (int num) {
        String[] nums = Integer.toString(num).split("");

        for (int i = 0; i < nums.length; i++) {
            if (nums[i].equals("6")) {
                nums[i] = "9";
                break;
            } 
        }

        return Integer.parseInt(String.join("", nums));
    }
}