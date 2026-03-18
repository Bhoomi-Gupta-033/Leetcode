class Solution {
    public String addBinary(String a, String b) {
      int aLen = a.length();
      int bLen = b.length();
         
        if(aLen > bLen){
            int n = aLen - bLen;
            
            while( n != 0){
                b = "0" + b;
                n--;
                System.out.print(b + " ");
            }
            System.out.println();
        }else if(bLen > aLen){
          int n = bLen - aLen;
          
            while( n != 0){
                a = "0" + a;
                n--;
                System.out.print(a + " ");
            }
        }

        int i = a.length()-1;
        String ans = ""; 
        int carry = 0;
        while(i>=0){
            char ch1 = a.charAt(i);
            char ch2 = b.charAt(i);

            if( ch1 == '0' && ch2 == '0'){
              if(carry == 0){
                ans = ans + "0";
              }else{
                 ans = ans + "1";
                 carry = 0;  
              }
              
            }else if(ch1 == '0'&& ch2 == '1' || ch1 == '1' && ch2 == '0'){
                if(carry == 0){
                ans = ans + "1";
              }else{
                 ans = ans + "0";
                 carry = 1; 
              }
             
            }else if(ch1 == '1' && ch2 == '1'){
                if(carry == 0){
                ans = ans + "0";
                carry =1;
              }else{
                 ans = ans + "1";
                 carry = 1;  
              }
             
            }
            i--;
        }

        if(carry == 1){
            ans = ans + "1";
        }

        String fin= "";

        for(int j = ans.length()-1; j>=0; j--){
            fin = fin + ans.charAt(j);
        }
        
            return fin;
        }
    }
