class Solution {
    public String longestNiceSubstring(String s) {
        if (s.length() < 2) {
            return "";
        }

        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check whether opposite case exists
            if (!set.contains(Character.toLowerCase(ch)) ||
                !set.contains(Character.toUpperCase(ch))) {

                String left = longestNiceSubstring(s.substring(0, i));
                String right = longestNiceSubstring(s.substring(i + 1));

                if (left.length() >= right.length()) {
                    return left;
                } else {
                    return right;
                }
            }
        }

        // Every character has both cases
        return s;
    }
}