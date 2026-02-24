class Solution {
    public int minimumDistance(int[] nums) {
    Map<Integer, List<Integer>> map = new HashMap<>();
    
    // Store indices for each value
    for (int i = 0; i < nums.length; i++) {
        map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
    }
    
    int min = Integer.MAX_VALUE;
    
    // Check triples for each value
    for (List<Integer> indices : map.values()) {
        if (indices.size() >= 3) {
            for (int i = 0; i <= indices.size() - 3; i++) {
                int first = indices.get(i);
                int third = indices.get(i + 2);
                
                min = Math.min(min, 2 * (third - first));
            }
        }
    }
    
    return min == Integer.MAX_VALUE ? -1 : min;
}
    }

