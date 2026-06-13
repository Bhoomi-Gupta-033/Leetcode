class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");
        
         HashMap<String , Integer> map = new HashMap<>();
        for(int i = 0; i<words.length;i++){
            map.put(words[i] , map.getOrDefault(words[i] , 0) +1);
        }

        for(int i = 0;i<banned.length; i++){
            if(map.containsKey(banned[i])) map.remove(banned[i]);
        }
         
         int max = Integer.MIN_VALUE;

         for(String str : map.keySet()){
            int a = map.get(str);
            max = Math.max(max , a);
         }
         
         for(String str : map.keySet()){
            int a = map.get(str);
            if(a == max) return str;
         }

        return " ";
    }
}
