class Solution {
    public String[] findRelativeRanks(int[] score) {
PriorityQueue<Integer> maxh = new PriorityQueue<>(Collections.reverseOrder());
     for(int num : score){
        maxh.offer(num);
     }
      
      String[] ans = new String[score.length];
      HashMap<Integer , Integer> map = new HashMap<>();
      
      int i =1;
      while( maxh.size() > 0){
        map.put(maxh.poll() , i);
        i++;
      }
       int j = 0;
       for(int num : score){
        int rank =  map.get(num);


        if(rank == 1){
            ans[j]="Gold Medal"; 
        }else if(rank == 2){
            ans[j]="Silver Medal";
        }else if(rank == 3){
            ans[j]="Bronze Medal";
        }else{
            ans[j]=String.valueOf(rank);
         }
         j++;
       }
     

   return ans;
    } 
}
