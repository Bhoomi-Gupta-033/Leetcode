class Solution {
    public String restoreString(String s, int[] indices) {
         char[] arr = new char[s.length()];

        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < indices.length; j++) {
                if(indices[j] == i) {
                    arr[i] = s.charAt(j);
                }
            }
        }

        return new String(arr);
    }
}
