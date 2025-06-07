class Solution {
    public String intToRoman(int num) {
        ArrayList<Integer> nums = decompose(num);
        StringBuilder sb = new StringBuilder();
        int[] values = {1000, 500, 100, 50, 10, 5, 1};

        for (int i = nums.size()-1; i >= 0; i--) {
            romanize(nums.get(i), values, sb);
        }

        return sb.toString();
    }

    private void romanize(int num, int[] values, StringBuilder sb) {
        switch (num) {
            case 4: sb.append("IV"); return;
            case 9: sb.append("IX"); return;
            case 40: sb.append("XL"); return;
            case 90: sb.append("XC"); return;
            case 400: sb.append("CD"); return;
            case 900: sb.append("CM"); return;
        }

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                System.out.println(num);
                num -= values[i];
                sb.append(romanOf(values[i]));
            }
        }
    }

    private Character romanOf(int num) {
        switch (num) {
            case 1: return 'I';
            case 5: return 'V';
            case 10: return 'X';
            case 50: return 'L';
            case 100: return 'C';
            case 500: return 'D';
            case 1000: return 'M';
            default: return 'x';
        }
    }

    private ArrayList<Integer> decompose(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        int multiply = 1;

        while (num > 0) {
            int n = num % 10;
            num = num / 10;
            list.add(n * multiply);
            multiply *= 10;
        }

        return list;
    }
}