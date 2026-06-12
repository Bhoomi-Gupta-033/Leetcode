class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<candyType.length; i++){
            map.put(candyType[i] , map.getOrDefault(candyType[i] , 0) +1);
        } 

        int eat = candyType.length /2;
        int type = map.size();

        if(eat > type) return type;
        else if(eat < type) return eat;
        else return eat;
    }
}
