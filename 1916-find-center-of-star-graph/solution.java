class Solution {
    public int findCenter(int[][] edges) {
        int row= edges.length;
        int col = edges[0].length;
         HashSet<Integer> set = new HashSet<>();  
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                if(set.contains(edges[i][j])) return edges[i][j];
                set.add(edges[i][j]);
            }
        }

        return 0;
    }
}
