class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int low = 0;
        int high = n - 1;
         String check = "aeiouAEIOU";
        while (low < high) {
            char ch1 = arr[low];
            char ch2 = arr[high];
            if (check.indexOf(ch1) != -1 && check.indexOf(ch2) != -1 ) {
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            } else if (check.indexOf(ch1) == -1) {
                low++;
            } else if (check.indexOf(ch2) == -1) {
                high--;
            }
        }

        // String str = "";

        // for (int i = 0; i < n; i++) {
        //     str += arr[i];
        // }

        return new String(arr);
    }
}
