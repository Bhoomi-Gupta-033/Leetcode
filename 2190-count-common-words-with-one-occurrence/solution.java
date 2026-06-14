class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String , Integer> word1 = new HashMap<>();
        HashMap<String , Integer> word2 = new HashMap<>();

        for(int i = 0; i<words1.length;i++){
            word1.put(words1[i] , word1.getOrDefault(words1[i] , 0)+1);
        }

        for(int i = 0; i<words2.length;i++){
            word2.put(words2[i] , word2.getOrDefault(words2[i] , 0)+1);
        }
         int count = 0;
         for(String key : word1.keySet()){
            if(word2.containsKey(key)){
                if(word1.get(key) == 1 && word2.get(key) == 1) count++;
            }
         }

         return count;
    }
}
