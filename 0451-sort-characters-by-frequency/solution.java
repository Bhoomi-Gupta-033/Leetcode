class Solution {
    public String frequencySort(String s) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

  List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue()); // descending order
        String ans = "";
        for(Map.Entry<Character, Integer> entry : list){
            char ch = entry.getKey();
            int freq = entry.getValue();

            for(int i=0; i<freq;i++){
                ans = ans + ch;
            }
        }
         
         return ans;
    }
}
