class Solution {

    public List<String> removeInvalidParentheses(String s) {

        List<String> ans = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(s);
        visited.add(s);

        boolean found = false;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int x = 0; x < size; x++) {

                String curr = q.poll();

                if (isValid(curr)) {
                    ans.add(curr);
                    found = true;
                }

                if (found) {
                    continue;
                }

                for (int i = 0; i < curr.length(); i++) {

                    if (curr.charAt(i) != '(' && curr.charAt(i) != ')') {
                        continue;
                    }

                    String next = curr.substring(0, i) + curr.substring(i + 1);

                    if (!visited.contains(next)) {
                        visited.add(next);
                        q.add(next);
                    }
                }
            }

            if (found) {
                break;
            }
        }

        return ans;
    }

    public boolean isValid(String s) {

        int balance = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                balance++;
            } 
            else if (s.charAt(i) == ')') {
                balance--;
            }

            if (balance < 0) {
                return false;
            }
        }

        return balance == 0;
    }
}