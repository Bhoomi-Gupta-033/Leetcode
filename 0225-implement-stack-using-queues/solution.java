class MyStack {

   Queue<Integer> queue;

    public MyStack() {
       queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        
    }

    public int pop() {
       Queue<Integer> q2 = new LinkedList<>();

         int n = queue.size();

         for(int i = n; i>1; i--){
            q2.add(queue.remove());
         }  

         int val = queue.remove();

         for(int i = 1 ; i<n; i++){
              queue.add(q2.remove()) ;
         }

         return val;

    }

    public int top() {
       Queue<Integer> q2 = new LinkedList<>();

         int n = queue.size();

         for(int i = n; i>1; i--){
            q2.add(queue.remove());
         }  

         int val = queue.remove();

         for(int i = 1 ; i<n; i++){
              queue.add(q2.remove()) ;
         }
          
          queue.add(val);

         return val;
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
