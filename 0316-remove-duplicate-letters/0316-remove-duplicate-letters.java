class Solution {
    public String removeDuplicateLetters(String s) {

        Stack<Character> st = new Stack<>();

        int[] freq = new int[26];
        boolean[] used = new boolean[26];

        // Frequency count
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {

            // Current character process ho raha hai
            freq[ch - 'a']--;

            // Already stack mein hai
            if (used[ch - 'a']) {
                continue;
            }

            // Smaller current character ko priority do
            while (!st.isEmpty()
                    && st.peek() > ch
                    && freq[st.peek() - 'a'] > 0) {

                used[st.pop() - 'a'] = false;
            }

            st.push(ch);
            used[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}