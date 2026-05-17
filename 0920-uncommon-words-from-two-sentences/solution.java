class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] a = (s1 + " " + s2).split(" ");
        List<String> list = new ArrayList<>();

        for(int i = 0; i < a.length; i++) {
            int count = 0;

            for(int j = 0; j < a.length; j++) {
                if(a[i].equals(a[j])) {
                    count++;
                }
            }

            if(count == 1) {
                list.add(a[i]);
            }
        }

        return list.toArray(new String[0]);
    }
}
