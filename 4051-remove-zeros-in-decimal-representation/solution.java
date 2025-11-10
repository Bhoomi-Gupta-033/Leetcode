class Solution {
    public long removeZeros(long n) {
        long rev =0;

while(n !=0){
  long rem = n%10;
  if(rem>0){
    rev = rev *10 +rem;
  }
  n = n/10;
}

long fr = 0 ;
while(rev != 0){
    long rem  = rev%10;
    fr = fr*10 +rem;
    rev = rev /10;
}
return fr;

    }
}
