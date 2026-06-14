class Solution {
    public int findJudge(int n, int[][] trust) {
        ArrayList<Integer> li = new ArrayList<>();

        for(int i = 0; i<trust.length;i++){
            li.add(trust[i][0]);
        }
         int judge = -1;
        for(int i = 1; i<=n;i++){
            if(!li.contains(i)){
                
                    judge = i;
                    break;
                
            }
        }

        if (judge == -1) return -1;

        int count = 0;

        for (int i = 0; i < trust.length; i++) {
            if (trust[i][1] == judge) {
                count++;
            }
        }

        return count == n - 1 ? judge : -1;
    }
}
