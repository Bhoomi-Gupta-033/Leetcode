class Solution {
    public boolean equalFrequency(String word) {
        

    int n = word.length();

    HashMap<Character, Integer> map = new HashMap<>();

    // Step 1: frequency map
    for (int i = 0; i < n; i++) {
        char c = word.charAt(i);
        map.put(c, map.getOrDefault(c, 0) + 1);
    }

    // Step 2: try removing one character
    for (char key : map.keySet()) {

        map.put(key, map.get(key) - 1);   // decrease frequency

        int freq = -1;
        boolean same = true;

        for (int val : map.values()) {

            if (val == 0) continue;

            if (freq == -1) {
                freq = val;
            } 
            else if (freq != val) {
                same = false;
                break;
            }
        }

        if (same) return true;

        map.put(key, map.get(key) + 1); // restore frequency
    }

    return false;

        
        
        
    }
}
