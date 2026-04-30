class Solution {
    public int maxProduct(int[] nums) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
           
         for(int num : nums){
            pq.offer(num);
         }

         int a = pq.poll()-1;
         int b  = pq.poll()-1;

         return a*b;

    }
}
