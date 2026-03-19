class Solution {
    public int minDeletionSize(String[] strs) {

    int row = strs.length;
    int col = strs[0].length();

    int count = 0;

    for(int j = 0; j < col; j++){   // column loop

        for(int i = 1; i < row; i++){   // row loop

            if(strs[i].charAt(j) < strs[i-1].charAt(j)){
                count++;
                break;
            }

        }

    }

    return count;

    }
}
