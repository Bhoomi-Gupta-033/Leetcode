class Solution {
    public int firstUniqChar(String s) {
        
        int n = s.length();

        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();

        for(int i= 0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        for(char key : map.keySet()){
           
                if(map.get(key) == 1){
                return s.indexOf(key);
            
            }
        }

        return -1;
    } 
}
