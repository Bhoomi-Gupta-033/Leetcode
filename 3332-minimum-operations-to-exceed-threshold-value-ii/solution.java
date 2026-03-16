class Solution {
    public int minOperations(int[] nums, int k) {
        
        
        PriorityQueue<Long> pq = new PriorityQueue<>();

        // add all numbers to heap
        for(int num : nums){
            pq.add((long)num);
        }

        int operations = 0;

        while(pq.size() >= 2 && pq.peek() < k){

            long x = pq.poll();
            long y = pq.poll();

            long newVal = 2 * x + y;

            pq.add(newVal);

            operations++;
        }

        if(pq.peek() >= k){
            return operations;
        }

        return -1;
        
    }
}
