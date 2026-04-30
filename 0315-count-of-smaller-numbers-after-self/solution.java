class Solution {

    int[] count;
    int[] index;
    int[] nums;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        this.nums = nums;
        count = new int[n];
        index = new int[n];

        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        mergeSort(0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int c : count) {
            result.add(c);
        }

        return result;
    }

    private void mergeSort(int left, int right) {

        if (left >= right) return;

        int mid = (left + right) / 2;

        mergeSort(left, mid);
        mergeSort(mid + 1, right);

        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        int rightCount = 0;

        while (i <= mid && j <= right) {

            if (nums[index[j]] < nums[index[i]]) {

                rightCount++;
                temp[k++] = index[j++];
            } 
            else {

                count[index[i]] += rightCount;
                temp[k++] = index[i++];
            }
        }

        while (i <= mid) {
            count[index[i]] += rightCount;
            temp[k++] = index[i++];
        }

        while (j <= right) {
            temp[k++] = index[j++];
        }

        for (int t = 0; t < temp.length; t++) {
            index[left + t] = temp[t];
        }
    }
}
