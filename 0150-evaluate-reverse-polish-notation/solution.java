class Solution {
    public int evalRPN(String[] tokens) {
         Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {

            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if (t.equals("+")) result = a + b;
                else if (t.equals("-")) result = a - b;
                else if (t.equals("*")) result = a * b;
                else if (t.equals("/")) result = a / b;

                stack.push(result);

            } else {
                stack.push(Integer.parseInt(t));
            }
        }

        return stack.pop();
    }
}
