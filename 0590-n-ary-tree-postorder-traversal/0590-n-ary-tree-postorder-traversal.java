class Solution {
    public List<Integer> postorder(Node root) {

        List<Integer> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        Stack<Node> st = new Stack<>();
        st.push(root);

        while (!st.isEmpty()) {

            Node curr = st.pop();

            ans.add(curr.val);

            // Normal order me push karo
            for (int i = 0; i < curr.children.size(); i++) {
                st.push(curr.children.get(i));
            }
        }

        // Reverse the answer
        Collections.reverse(ans);

        return ans;
    }
}