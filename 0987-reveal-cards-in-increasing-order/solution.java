class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
         int n = deck.length;

        Arrays.sort(deck);

        int[] ans = new int[n];

        Queue<Integer> q = new LinkedList<>();

        // store indices
        for(int i = 0; i < n; i++) {
            q.offer(i);
        }

        for(int num : deck) {

            // place current smallest card
            int index = q.poll();
            ans[index] = num;

            // move next index to back
            if(!q.isEmpty()) {
                q.offer(q.poll());
            }
        }

        return ans;
    }
}
