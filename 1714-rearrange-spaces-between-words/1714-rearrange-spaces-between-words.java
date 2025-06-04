class Solution {
    public String reorderSpaces(String text) {
        int spaces = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') spaces++;
        }

        if (spaces == 0) return text;

        String[] words = text.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        if (words.length == 1) {
            sb.append(words[0]);
            while (spaces-- > 0) sb.append(' ');
            return sb.toString();
        }

        int addSpaces = spaces / (words.length - 1);

        for (int i = 0; i < words.length - 1; i++) {
            sb.append(words[i]);
            int j = addSpaces;
            while (j-- > 0) sb.append(' ');
            spaces -= addSpaces;
        }

        sb.append(words[words.length-1]);

        while (spaces-- > 0) {
            sb.append(' ');
        }
    
        return sb.toString();
    }
}