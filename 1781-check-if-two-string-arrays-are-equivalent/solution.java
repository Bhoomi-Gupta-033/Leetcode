class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String wordO ="";
        for(int i = 0; i<word1.length;i++){
    String s = word1[i];
    wordO= wordO+ s;
}

     String wordT ="";
     for(int i = 0; i<word2.length;i++){
     String s = word2[i];
     wordT = wordT + s;
}
     return wordT.equals(wordO);
        
    }
}
