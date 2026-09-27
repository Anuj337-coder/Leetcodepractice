class Solution {
    public String removeKdigits(String num, int k) {

        Stack<Character> st = new Stack<>();

        for (char ch : num.toCharArray()) {

            while (!st.isEmpty() && k > 0 && st.peek() > ch) {
                st.pop();
                k--;
            }

            st.push(ch);
        }

        // Agar k abhi bhi bacha hai
        while (k > 0) {
            st.pop();
            k--;
        }

        // Result banana
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        // Stack se reverse order mein nikla hai
        ans.reverse();

        // Leading zeros remove karna
        int i = 0;

        while (i < ans.length() && ans.charAt(i) == '0') {
            i++;
        }

        if (i == ans.length()) {
            return "0";
        }

        return ans.substring(i);
    }
}