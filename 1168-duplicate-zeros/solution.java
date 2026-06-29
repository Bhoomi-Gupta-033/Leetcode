class Solution {
    public void duplicateZeros(int[] arr) {
         int n = arr.length;
        int[] temp = new int[n];

        int i = 0; // arr pointer
        int j = 0; // temp pointer

        while (i < n && j < n) {
            if (arr[i] == 0) {
                temp[j++] = 0;

                if (j < n) {
                    temp[j++] = 0;
                }
            } else {
                temp[j++] = arr[i];
            }
            i++;
        }

        // Copy back to original array
        for (i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
