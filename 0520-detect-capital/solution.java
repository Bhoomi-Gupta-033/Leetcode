class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();

        char[] arr = word.toCharArray();

        int capCount = 0;
        int smallCount = 0;

        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            for (int i = 0; i < arr.length; i++) {
                char ch = arr[i];
                if (ch >= 'A' && ch <= 'Z') {
                    capCount++;
                }
            }

            if (capCount == n || capCount == 1) {
                return true;
            }
        } else if (word.charAt(0) >= 'a' && word.charAt(0) <= 'z') {
            for (int i = 0; i < arr.length; i++) {
                char ch = arr[i];
                if (ch >= 'a' && ch <= 'z') {
                    smallCount++;  
                }
            }

            if(smallCount == n){
                return true;
            }
        }

        return false;

    }
}
