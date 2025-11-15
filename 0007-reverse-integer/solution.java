class Solution {
    public int reverse(int x) {

            int n = -1 *x;
            long rev = 0;
            while( n!= 0 ){
                int rem = n%10;
                rev = rev *10 + rem;
                n = n/10;
            }
            long nrev = -1 * rev;
            if(nrev > Integer.MAX_VALUE || nrev < Integer.  MIN_VALUE) {
            return 0;
        } 
            return( int)nrev;
        }
    }

