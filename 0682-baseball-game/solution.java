class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st  = new Stack<>();
        //  ArrayList<Integer> list = new ArrayList<>();
        int n = operations.length;

        for(int i = 0; i<n; i++){
            String s = operations[i];

            if(s.equals("C")){
                if(!st.isEmpty()){
                    st.pop();
                    // list.remove(st.pop());
                }
            }else if(s.equals("D") && st.isEmpty() == false){
                int a = st.peek();
                st.push(a*2);
                // list.add(a*2);
            }else if(s.equals("+")){
                int sum = 0;
                
                int a = st.pop();
                int b = st.pop();

                sum = a+b;
                // list.add(sum);

                st.push(b);
                st.push(a);
                st.push(sum);

                  

            }else{
                int a = Integer.parseInt(s);
                st.push(a);
                // list.add(a);
            }

            System.out.print(st);
            // System.out.print(list);
            System.out.println(); 

        }
        
        int sum = 0;
        // for(int i =0; i<list.size(); i++){
        //     sum = sum + list.get(i); 
        // }

        while(!st.isEmpty()){
            sum+=st.pop();
        }

        return sum;
    }
}
