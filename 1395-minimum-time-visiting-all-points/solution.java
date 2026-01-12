class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum = 0;

        for(int i=0 ; i<points.length-1;i++){
            int[] cord1 = points[i];
              int x1 =  cord1[0];
              int y1 =  cord1[1];
            int[] cord2 = points[i+1];
               int x2 =  cord2[0];
               int y2 =  cord2[1];

               sum = sum +  Math.max((Math.abs(x2-x1)) , (Math.abs(y2-y1)));
        }

        return sum;
    }
}
