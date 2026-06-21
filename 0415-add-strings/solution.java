import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
         BigInteger s1 = new BigInteger(num1);
         BigInteger s2 = new BigInteger(num2);

         BigInteger ans = s1.add(s2);

        return ans.toString();
    }
}
