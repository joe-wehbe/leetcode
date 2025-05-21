class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for (String email : emails) {
            set.add(getActualEmail(email));
        }

        return set.size();
    }

    private String getActualEmail(String email) {
        StringBuilder sb = new StringBuilder();
        boolean local = true, ignore = false;

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);

            if (local) {
                if (c == '+') ignore = true;
                if (c == '@') local = ignore = false;
                if (!ignore && c != '.') sb.append(c);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}