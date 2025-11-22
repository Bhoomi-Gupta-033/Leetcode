class Solution {
    public char kthCharacter(int k) {
         String word = "a";

    while (word.length() < k) {
      String str = ""; 

      for (int i = 0; i < word.length(); i++) {
        char ch = word.charAt(i);

        if (ch != 'z') {
          ch = (char) (ch + 1);
          str = str + ch;
        } else {
          str = str + 'a';
        }
      }

      word = word + str; 
    }

    

    return word.charAt(k-1);
    }
}
