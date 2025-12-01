class Solution {
    public String countAndSay(int n) {
      

String cs = "1";  
if (n == 1) {
    return cs;
} else {
    for (int j = 2; j <= n; j++) {
        String s = "";
        int count = 1;

        for (int i = 1; i < cs.length(); i++) {
            if (cs.charAt(i) == cs.charAt(i - 1)) {
                count++;
            } else {
                s += count + "" + cs.charAt(i - 1);
                count = 1;
            }
        }

        s += count + "" + cs.charAt(cs.length() - 1);
        cs = s;  
    }

   return cs;
}

    }
}
