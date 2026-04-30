class Solution {
    public String removeKdigits(String num, int k) {
         Stack<Character> stack = new Stack<>();

        for (char c : num.toCharArray()) {

            while (k > 0 && !stack.isEmpty() && stack.peek() > c) {
                stack.pop();
                k--;
            }

            stack.push(c);
        }

        // remove remaining k digits
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        // build result
        StringBuilder sb = new StringBuilder();

        for (char c : stack) {
            sb.append(c);
        }

        // remove leading zeros
        String result = sb.toString().replaceFirst("^0+", "");

        return result.equals("") ? "0" : result;
    }
}
