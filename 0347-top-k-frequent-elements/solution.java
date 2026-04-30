class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList);

        int i = valueList.size() - 1;
        int count = 0;
        int[] arr = new int[k];
        while (count < k) {
            arr[count] = valueList.get(i);
            count++;
            i--;
        }

        int[] ans = new int[k];
        HashSet<Integer> used = new HashSet<>(); 

        for (int a = 0; a < k; a++) {
            for (int key : map.keySet()) {
                if (map.get(key) == arr[a] && !used.contains(key)) {
                    ans[a] = key;
                    used.add(key); 
                    break; 
                }
            }
        }

        return ans;

    }
}
