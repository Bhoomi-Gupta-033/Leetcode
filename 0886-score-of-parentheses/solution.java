class Solution {
    public int scoreOfParentheses(String s) {
         Stack<Integer> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(') {
                stack.push(0); // marker
            } 
            else {

                int val = 0;

                while (stack.peek() != 0) {
                    val += stack.pop();
                }

                stack.pop(); // remove '(' marker

                stack.push(val == 0 ? 1 : 2 * val);
            }
        }

        int result = 0;

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
