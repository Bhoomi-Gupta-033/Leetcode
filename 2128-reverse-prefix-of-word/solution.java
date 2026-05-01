class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = -1;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                idx = i;
                break;
            }
        }

        if (idx == -1) return word;

        char[] arr = word.toCharArray();

        int i = 0, j = idx;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }
}
