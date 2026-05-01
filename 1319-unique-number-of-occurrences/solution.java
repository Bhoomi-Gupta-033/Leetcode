class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
            int count1 = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count1++;
                }
            }

            for (int k = i + 1; k < arr.length; k++) {
                int count2 = 0;
                for (int l = 0; l < arr.length; l++) {
                    if (arr[l] == arr[k]) {
                        count2++;
                    }
                }

                if (count1 == count2 && arr[i] != arr[k]) {
                    return false;
                }
            }
        }
        return true;
    }
}
