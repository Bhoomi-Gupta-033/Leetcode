class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
         int[] diff = new int[102];

        for (List<Integer> car : nums) {

            int start = car.get(0);
            int end = car.get(1);

            diff[start]++;
            diff[end + 1]--;
        }

        int curr = 0;
        int count = 0;

        for (int i = 1; i <= 100; i++) {

            curr += diff[i];

            if (curr > 0) {
                count++;
            }
        }

        return count;
    }
}
