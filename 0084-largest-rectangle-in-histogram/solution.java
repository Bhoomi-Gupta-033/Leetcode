class Solution {
    public int[] nextSmallerNumber(int[] nums){
        Stack<Integer> s = new Stack<>();
          s.push(-1);  

          int[] ans = new int[nums.length];
        for(int i = nums.length-1; i >=0 ; i--){
            while(s.peek() != -1 && nums[s.peek()] >= nums[i]){
                s.pop();
            }
            ans[i] = s.peek(); 
            s.push(i); 
        }

        return ans;
    }

    public int[] previousSmallerNumber(int[] nums){
        Stack<Integer> s = new Stack<>();
          s.push(-1);  

          int[] ans = new int[nums.length];
        for(int i =0; i < nums.length; i++){
            while(s.peek() != -1 && nums[s.peek()] >= nums[i]){
                s.pop();
            }
            ans[i] = s.peek(); 
            s.push(i); 
        }

        return ans;
    }


    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
       int[] next = nextSmallerNumber(heights);
       int[] previous = previousSmallerNumber(heights);
        
        int area = Integer.MIN_VALUE;
       for(int i = 0;i<n;i++){
          int h = heights[i];

          if(next[i] == -1){
            next[i] = n;
          }

          int b = next[i] - previous[i]-1;
          area = Math.max(area , h*b);

       }

       return area;
    }
}
