class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int low = 0;
        int high = n - 1;

        while (low < high) {
            char ch1 = arr[low];
            char ch2 = arr[high];
            if (Character.isLetter(ch1) && Character.isLetter(ch2)) {
                char temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            } else if (!Character.isLetter(ch1)) {
                low++;
            } else if (!Character.isLetter(ch2)) {
                high--;
            }
        }

        String str = "";

        for (int i = 0; i < n; i++) {
            str += arr[i];
        }

        return str;
    }
}
